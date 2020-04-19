package io.github.lexcao.equality.subjects

import io.github.lexcao.equality.condition.Subject

object KotlinCase {

    val typeClass: Subject<MyKotlinClass> =
        Subject(MyKotlinClass::class.java, "Kotlin_Class", "MyKotlinClass()")

    val typeEnum: Subject<AnnotationRetention> =
        Subject(AnnotationRetention::class.java, "Kotlin_Enum", "AnnotationRetention.SOURCE")

    val typeStatic: Subject<MyKotlinObject> =
        Subject(MyKotlinObject::class.java, "Kotlin_Static", "MyKotlinObject")
}