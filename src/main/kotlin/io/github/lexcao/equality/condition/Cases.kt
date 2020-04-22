package io.github.lexcao.equality.condition

import io.github.lexcao.equality.poets.ControlFlow
import io.github.lexcao.equality.subjects.JavaCase
import io.github.lexcao.equality.subjects.KotlinCase

object Cases {

    private val subjects: List<CompositeSubject> =
        composite(KotlinCase.KotlinClass()) +
                composite(KotlinCase.KotlinEnum()) +
                composite(KotlinCase.KotlinStatic())

    private fun composite(kotlin: KotlinSubject): List<CompositeSubject> {
        return listOf(
            CompositeSubject(
                java = JavaCase.JavaClass(),
                kotlin = kotlin
            ),
            CompositeSubject(
                java = JavaCase.JavaEnum(),
                kotlin = kotlin
            ),
            CompositeSubject(
                java = JavaCase.JavaStatic(),
                kotlin = kotlin
            )
        )
    }

    fun kotlinFunctions(): List<ControlFlow.KotlinCF> {
        val pairs = subjects.flatMap { it.pairs() }
            .distinct()

        return pairs.map {
            ControlFlow.IfK(
                name = "if_${it.name}",
                pair = it
            )
        }
    }

    fun javaMethods(): List<ControlFlow.JavaCF> {
        val pairs = subjects.flatMap { it.pairs() }
            .distinct()
        return pairs.map {
            ControlFlow.IfJ(
                name = "if_${it.name}",
                pair = it
            )
        }
    }

    private val Pair<Subject, Subject>.name: String
        get() = "${first.name}_To_${second.name}"
}