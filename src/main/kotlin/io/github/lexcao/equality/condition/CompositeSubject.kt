package io.github.lexcao.equality.condition

data class CompositeSubject(
    val java: JavaSubject,
    val kotlin: KotlinSubject
) {
    fun pairs(): List<Pair<Subject, Subject>> = listOf(
        java.backup() to java, // J 2 J
        java to kotlin, // J 2 K
        kotlin.backup() to kotlin, // K 2 K
        kotlin.backup().nullable() to kotlin, // K? 2 K
        kotlin.nullable() to java // K? 2 J
    )
}
