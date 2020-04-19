package io.github.lexcao.equality.condition

import io.github.lexcao.equality.poets.ControlFlow
import io.github.lexcao.equality.subjects.JavaCase
import io.github.lexcao.equality.subjects.KotlinCase

object Cases {

    private val subjects: List<CompositeSubject> = listOf(
        CompositeSubject(
            type = SubjectType.CLASS,
            java = JavaCase.typeClass,
            kotlin = KotlinCase.typeClass
        ),
        CompositeSubject(
            type = SubjectType.ENUM,
            java = JavaCase.typeEnum,
            kotlin = KotlinCase.typeEnum
        ),
        CompositeSubject(
            type = SubjectType.STATIC,
            java = JavaCase.typeStatic,
            kotlin = KotlinCase.typeStatic
        )
    )

    fun kotlinFunctions(): List<ControlFlow.KotlinCF> {
        return subjects.flatMap { it.generateKotlinControlFlow() }
    }

    fun javaMethods(): List<ControlFlow.JavaCF> {
        return subjects.flatMap { it.generateIfJ() } +
                subjects.filter { it.type == SubjectType.ENUM }
                    .flatMap { it.generateSwitchJ() }
    }
}