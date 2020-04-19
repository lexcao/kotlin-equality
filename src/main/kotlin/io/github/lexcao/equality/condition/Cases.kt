package io.github.lexcao.equality.condition

import io.github.lexcao.equality.poets.ControlFlow
import io.github.lexcao.equality.subjects.JavaCase
import io.github.lexcao.equality.subjects.KotlinCase

object Cases {

    private val subjects: List<CompositeSubject> = composite(KotlinCase.typeClass) +
            composite(KotlinCase.typeEnum) + composite(KotlinCase.typeStatic)

    private fun composite(kotlin: Subject): List<CompositeSubject> {
        return listOf(
            CompositeSubject(
                java = JavaCase.typeClass,
                kotlin = kotlin
            ),
            CompositeSubject(
                java = JavaCase.typeEnum,
                kotlin = kotlin
            ),
            CompositeSubject(
                java = JavaCase.typeStatic,
                kotlin = kotlin
            )
        )
    }

    fun kotlinFunctions(): List<ControlFlow.KotlinCF> {
        val pairs = subjects.flatMap { it.pairs }
            .distinct()

        return pairs.map {
            ControlFlow.IfK(
                name = "if_${it.name}",
                pair = it
            )
        } + pairs.map {
            ControlFlow.WhenK(
                name = "when_${it.name}",
                pair = it
            )
        }
    }

    fun javaMethods(): List<ControlFlow.JavaCF> {
        val pairs = subjects.flatMap { it.pairs }
            .distinct()
        return pairs.map {
            ControlFlow.IfJ(
                name = "if_${it.name}",
                pair = it
            )
        } + pairs.filter { it.first.type == SubjectType.ENUM }
            .map {
                ControlFlow.SwitchJ(
                    name = "switch_${it.name}",
                    pair = it
                )
            }
    }

    private val Pair<Subject, Subject>.name: String
        get() = "${first}_To_${second}"
}