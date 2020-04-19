package io.github.lexcao.equality.subjects

import io.github.lexcao.equality.condition.Subject

object KotlinCase {

    val typeClass: Subject = Subject(
        MyKotlinClassA::class.java,
        MyKotlinClassB::class.java,
        "Kotlin_Class",
        "MyKotlinClassA()"
    )

    val typeEnum: Subject = Subject(
        AnnotationRetention::class.java,
        AnnotationTarget::class.java,
        "Kotlin_Enum",
        "AnnotationRetention.SOURCE"
    )

    val typeStatic: Subject = Subject(
        MyKotlinObjectA::class.java,
        MyKotlinObjectB::class.java,
        "Kotlin_Static",
        "MyKotlinObjectA"
    )
}