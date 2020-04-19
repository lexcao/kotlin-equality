package io.github.lexcao.equality.condition

import io.github.lexcao.equality.poets.ControlFlow

data class CompositeSubject(
    val type: SubjectType,
    val java: Subject,
    val kotlin: Subject
) {

    private val pairs = listOf(
        java.backup() to java, // J 2 J
        java to kotlin, // J 2 K
        kotlin.backup() to kotlin, // K 2 K
        kotlin.backup().nullable() to kotlin, // K? 2 K
        kotlin.nullable() to java // K? 2 J
    )

    fun generateKotlinControlFlow(): List<ControlFlow.KotlinCF> {
        return generateIfK() + generateWhenK()
    }

    fun generateJavaControlFlow(): List<ControlFlow.JavaCF> {
        return generateIfJ() + generateSwitchJ()
    }

    fun generateIfJ(): List<ControlFlow.IfJ> {
        return pairs.map {
            ControlFlow.IfJ(
                name = "if_${it.name}",
                pair = it
            )
        }
    }

    fun generateSwitchJ(): List<ControlFlow.SwitchJ> {
        return pairs.map {
            ControlFlow.SwitchJ(
                name = "switch_${it.name}",
                pair = it
            )
        }
    }

    fun generateIfK(): List<ControlFlow.IfK> {
        return pairs.map {
            ControlFlow.IfK(
                name = "if_${it.name}",
                pair = it
            )
        }
    }

    fun generateWhenK(): List<ControlFlow.WhenK> {
        return pairs.map {
            ControlFlow.WhenK(
                name = "when_${it.name}",
                pair = it
            )
        }
    }

    private val Pair<Subject, Subject>.name: String
        get() = "${first}_To_${second}"
}
