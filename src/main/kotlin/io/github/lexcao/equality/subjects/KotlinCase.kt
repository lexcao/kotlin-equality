package io.github.lexcao.equality.subjects

import io.github.lexcao.equality.condition.Subject
import io.github.lexcao.equality.condition.SubjectType

object KotlinCase {

    val typeClass: Subject = Subject(
        target = MyKotlinClassA::class.java,
        backup = MyKotlinClassB::class.java,
        type = SubjectType.CLASS,
        name = "Kotlin_Class",
        value = "MyKotlinClassA()"
    )

    val typeEnum: Subject = Subject(
        target = AnnotationRetention::class.java,
        backup = AnnotationTarget::class.java,
        type = SubjectType.ENUM,
        name = "Kotlin_Enum",
        value = "AnnotationRetention.SOURCE"
    )

    val typeStatic: Subject = Subject(
        target = MyKotlinObjectA::class.java,
        backup = MyKotlinObjectB::class.java,
        type = SubjectType.STATIC,
        name = "Kotlin_Static",
        value = "MyKotlinObjectA"
    )
}