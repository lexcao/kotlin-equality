package io.github.lexcao.equality.subjects

import io.github.lexcao.equality.condition.ClassType
import io.github.lexcao.equality.condition.EnumType
import io.github.lexcao.equality.condition.JavaSubject
import io.github.lexcao.equality.condition.StaticType
import io.github.lexcao.equality.condition.Subject
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import javax.print.attribute.standard.JobState
import javax.print.attribute.standard.JobStateReason

object JavaCase {

    data class JavaClass(
        override val target: Class<out Any> = MyJavaClassA::class.java,
        override val backup: Class<out Any> = MyJavaClassB::class.java
    ) : JavaSubject, ClassType {

        override fun javaValue(): String {
            return "new " + kotlinValue()
        }

        override fun kotlinValue(): String {
            return "${target.simpleName}()"
        }

        override fun backup(): Subject {
            return copy(target = backup, backup = target)
        }
    }

    data class JavaEnum(
        override val target: Class<out Any> = RetentionPolicy::class.java,
        override val backup: Class<out Any> = ElementType::class.java
    ) : JavaSubject, EnumType {

        override fun javaValue(): String {
            return kotlinValue()
        }

        override fun kotlinValue(): String {
            return "RetentionPolicy.SOURCE"
        }

        override fun backup(): Subject {
            return copy(target = backup, backup = target)
        }
    }

    data class JavaStatic(
        override val target: Class<out Any> = JobState::class.java,
        override val backup: Class<out Any> = JobStateReason::class.java
    ) : JavaSubject, StaticType {

        override fun javaValue(): String {
            return kotlinValue()
        }

        override fun kotlinValue(): String {
            return "JobState.CANCELED"
        }

        override fun backup(): Subject {
            return copy(target = backup, backup = target)
        }
    }
}