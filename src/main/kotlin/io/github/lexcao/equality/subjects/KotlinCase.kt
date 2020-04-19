package io.github.lexcao.equality.subjects

import io.github.lexcao.equality.condition.ClassType
import io.github.lexcao.equality.condition.EnumType
import io.github.lexcao.equality.condition.KotlinSubject
import io.github.lexcao.equality.condition.StaticType

object KotlinCase {

    data class KotlinClass(
        override val target: Class<out Any> = MyKotlinClassA::class.java,
        override val backup: Class<out Any> = MyKotlinClassB::class.java,
        override val nullable: Boolean = false
    ) : KotlinSubject, ClassType {

        override fun javaValue(): String {
            return "new " + kotlinValue()
        }

        override fun kotlinValue(): String {
            return "${target.simpleName}()"
        }

        override fun nullable(): KotlinSubject {
            return copy(nullable = true)
        }

        override fun backup(): KotlinSubject {
            return copy(target = backup, backup = target)
        }
    }

    data class KotlinEnum(
        override val target: Class<out Any> = AnnotationRetention::class.java,
        override val backup: Class<out Any> = AnnotationTarget::class.java,
        override val nullable: Boolean = false
    ) : KotlinSubject, EnumType {

        override fun javaValue(): String {
            return kotlinValue()
        }

        override fun kotlinValue(): String {
            return "AnnotationRetention.SOURCE"
        }

        override fun nullable(): KotlinSubject {
            return copy(nullable = true)
        }

        override fun backup(): KotlinSubject {
            return copy(target = backup, backup = target)
        }
    }

    data class KotlinStatic(
        override val target: Class<out Any> = MyKotlinObjectA::class.java,
        override val backup: Class<out Any> = MyKotlinObjectB::class.java,
        override val nullable: Boolean = false
    ) : KotlinSubject, StaticType {

        override fun javaValue(): String {
            return kotlinValue() + ".INSTANCE"
        }

        override fun kotlinValue(): String {
            return "MyKotlinObjectA"
        }

        override fun nullable(): KotlinSubject {
            return copy(nullable = true)
        }

        override fun backup(): KotlinSubject {
            return copy(target = backup, backup = target)
        }
    }
}