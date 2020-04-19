package io.github.lexcao.equality.condition

import io.github.lexcao.equality.poets.ControlFlow

data class CompositeSubject(
    val type: SubjectType,
    val java: Subject<*>,
    val kotlin: Subject<*>
) {

    private val pairs = listOf(
        java to java,
        java to kotlin,
        kotlin to kotlin,
        kotlin.nullable() to kotlin,
        kotlin.nullable() to java
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

    private val Pair<Subject<*>, Subject<*>>.name: String
        get() = "${first}_To_${second}"
}
