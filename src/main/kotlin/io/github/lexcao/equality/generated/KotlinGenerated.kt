package io.github.lexcao.equality.generated

import io.github.lexcao.equality.subjects.MyJavaClassA
import io.github.lexcao.equality.subjects.MyJavaClassB
import io.github.lexcao.equality.subjects.MyKotlinClassA
import io.github.lexcao.equality.subjects.MyKotlinClassB
import io.github.lexcao.equality.subjects.MyKotlinObjectA
import io.github.lexcao.equality.subjects.MyKotlinObjectB
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import javax.print.attribute.standard.JobState
import javax.print.attribute.standard.JobStateReason

class KotlinGenerated {
    fun if_Java_Class_To_Java_Class(a: MyJavaClassB) {
        if (a == MyJavaClassA()) {
            // compiled well
        }
    }

    fun if_Java_Class_To_Kotlin_Class(a: MyJavaClassA) {
        if (a == MyKotlinClassA()) {
            // [error] compiler
            // [EQUALITY_NOT_APPLICABLE] Operator '==' cannot be applied to 'MyJavaClassA' and 'MyKotlinClassA'
        }
    }

    fun if_Kotlin_Class_To_Kotlin_Class(a: MyKotlinClassB) {
        if (a == MyKotlinClassA()) {
            // [error] compiler
            // [EQUALITY_NOT_APPLICABLE] Operator '==' cannot be applied to 'MyKotlinClassB' and 'MyKotlinClassA'
        }
    }

    fun if_Nullable_Kotlin_Class_To_Kotlin_Class(a: MyKotlinClassB?) {
        if (a == MyKotlinClassA()) {
            // [error] compiler
            // [EQUALITY_NOT_APPLICABLE] Operator '==' cannot be applied to 'MyKotlinClassB?' and 'MyKotlinClassA'
        }
    }

    fun if_Nullable_Kotlin_Class_To_Java_Class(a: MyKotlinClassA?) {
        if (a == MyJavaClassA()) {
            // [error] compiler
            // [EQUALITY_NOT_APPLICABLE] Operator '==' cannot be applied to 'MyKotlinClassA?' and 'MyJavaClassA'
        }
    }

    fun when_Java_Class_To_Java_Class(a: MyJavaClassB) {
        // compiled well
        when (a) {
            MyJavaClassA() -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Java_Class_To_Kotlin_Class(a: MyJavaClassA) {
        // [error] compiler
        // [INCOMPATIBLE_TYPES] Incompatible types: MyKotlinClassA and MyJavaClassA
        when (a) {
            MyKotlinClassA() -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Kotlin_Class_To_Kotlin_Class(a: MyKotlinClassB) {
        // [error] compiler
        // [INCOMPATIBLE_TYPES] Incompatible types: MyKotlinClassA and MyKotlinClassB
        when (a) {
            MyKotlinClassA() -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Nullable_Kotlin_Class_To_Kotlin_Class(a: MyKotlinClassB?) {
        // [error] compiler
        // [INCOMPATIBLE_TYPES] Incompatible types: MyKotlinClassA and MyKotlinClassB?
        when (a) {
            MyKotlinClassA() -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Nullable_Kotlin_Class_To_Java_Class(a: MyKotlinClassA?) {
        // [error] compiler
        // [INCOMPATIBLE_TYPES] Incompatible types: MyKotlinClassA and MyKotlinClassA?
        when (a) {
            MyJavaClassA() -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun if_Java_Enum_To_Java_Enum(a: ElementType) {
        if (a == RetentionPolicy.SOURCE) {
            // [warning] IDEA
            // [INCOMPATIBLE_ENUM_COMPARISON] Comparison of incompatible enums
            // 'ElementType' and 'RetentionPolicy' is always unsuccessful
        }
    }

    fun if_Java_Enum_To_Kotlin_Enum(a: RetentionPolicy) {
        if (a == AnnotationRetention.SOURCE) {
            // [warning] IDEA
            // [INCOMPATIBLE_ENUM_COMPARISON] Comparison of incompatible enums
            // 'RetentionPolicy' and 'AnnotationRetention' is always unsuccessful
        }
    }

    fun if_Kotlin_Enum_To_Kotlin_Enum(a: AnnotationTarget) {
        if (a == AnnotationRetention.SOURCE) {
            // [warning] IDEA
            // [INCOMPATIBLE_ENUM_COMPARISON] Comparison of incompatible enums
            // 'AnnotationTarget' and 'AnnotationRetention' is always unsuccessful
        }
    }

    fun if_Nullable_Kotlin_Enum_To_Kotlin_Enum(a: AnnotationTarget?) {
        if (a == AnnotationRetention.SOURCE) {
            // [warning] IDEA
            // [INCOMPATIBLE_ENUM_COMPARISON] Comparison of incompatible enums
            // 'AnnotationTarget' and 'AnnotationRetention' is always unsuccessful
        }
    }

    fun if_Nullable_Kotlin_Enum_To_Java_Enum(a: AnnotationRetention?) {
        if (a == RetentionPolicy.SOURCE) {
            // [warning] IDEA
            // [INCOMPATIBLE_ENUM_COMPARISON] Comparison of incompatible enums
            // 'AnnotationRetention' and 'RetentionPolicy' is always unsuccessful
        }
    }

    fun when_Java_Enum_To_Java_Enum(a: ElementType) {
        // [warning] IDEA
        // [INCOMPATIBLE_ENUM_COMPARISON] Comparison of incompatible enums
        // 'ElementType' and 'RetentionPolicy' is always unsuccessful
        when (a) {
            RetentionPolicy.SOURCE -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Java_Enum_To_Kotlin_Enum(a: RetentionPolicy) {
        // [warning] IDEA
        // [INCOMPATIBLE_ENUM_COMPARISON] Comparison of incompatible enums
        // 'RetentionPolicy' and 'AnnotationRetention' is always unsuccessful
        when (a) {
            AnnotationRetention.SOURCE -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Kotlin_Enum_To_Kotlin_Enum(a: AnnotationTarget) {
        // [warning] IDEA
        // [INCOMPATIBLE_ENUM_COMPARISON] Comparison of incompatible enums
        // 'AnnotationTarget' and 'AnnotationRetention' is always unsuccessful
        when (a) {
            AnnotationRetention.SOURCE -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Nullable_Kotlin_Enum_To_Kotlin_Enum(a: AnnotationTarget?) {
        // [warning] IDEA
        // [INCOMPATIBLE_ENUM_COMPARISON] Comparison of incompatible enums
        // 'AnnotationTarget?' and 'AnnotationRetention' is always unsuccessful
        when (a) {
            AnnotationRetention.SOURCE -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Nullable_Kotlin_Enum_To_Java_Enum(a: AnnotationRetention?) {
        // [warning] IDEA
        // [INCOMPATIBLE_ENUM_COMPARISON] Comparison of incompatible enums
        // 'AnnotationRetention?' and 'RetentionPolicy' is always unsuccessful
        when (a) {
            RetentionPolicy.SOURCE -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun if_Java_Static_To_Java_Static(a: JobStateReason) {
        if (a == JobState.CANCELED) {
            // compiled well
        }
    }

    fun if_Java_Static_To_Kotlin_Static(a: JobState) {
        if (a == MyKotlinObjectA) {
            // [error] compiler
            // [EQUALITY_NOT_APPLICABLE] Operator '==' cannot be applied to 'JobState' and 'MyKotlinObjectA'
        }
    }

    fun if_Kotlin_Static_To_Kotlin_Static(a: MyKotlinObjectB) {
        if (a == MyKotlinObjectA) {
            // [error] compiler
            // [EQUALITY_NOT_APPLICABLE] Operator '==' cannot be applied to 'MyKotlinObjectB' and 'MyKotlinObjectA'
        }
    }

    fun if_Nullable_Kotlin_Static_To_Kotlin_Static(a: MyKotlinObjectB?) {
        if (a == MyKotlinObjectA) {
            // [error] compiler
            // [EQUALITY_NOT_APPLICABLE] Operator '==' cannot be applied to 'MyKotlinObjectB' and 'MyKotlinObjectA'
        }
    }

    fun if_Nullable_Kotlin_Static_To_Java_Static(a: MyKotlinObjectA?) {
        if (a == JobState.CANCELED) {
            // [error] compiler
            // [EQUALITY_NOT_APPLICABLE] Operator '==' cannot be applied to 'MyKotlinObjectA?' and 'JobState'
        }
    }

    fun when_Java_Static_To_Java_Static(a: JobStateReason) {
        // compiled well
        when (a) {
            JobState.CANCELED -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Java_Static_To_Kotlin_Static(a: JobState) {
        // [error] compiler
        // [INCOMPATIBLE_TYPES] Incompatible types: JobState and MyKotlinObjectA
        when (a) {
            MyKotlinObjectA -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Kotlin_Static_To_Kotlin_Static(a: MyKotlinObjectB) {
        // [error] compiler
        // [INCOMPATIBLE_TYPES] Incompatible types: MyKotlinObjectB and MyKotlinObjectA
        when (a) {
            MyKotlinObjectA -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Nullable_Kotlin_Static_To_Kotlin_Static(a: MyKotlinObjectB?) {
        // [error] compiler
        // [INCOMPATIBLE_TYPES] Incompatible types: MyKotlinObjectB? and MyKotlinObjectA
        when (a) {
            MyKotlinObjectA -> {
            }
            else -> throw IllegalStateException()
        }
    }

    fun when_Nullable_Kotlin_Static_To_Java_Static(a: MyKotlinObjectA?) {
        // [error] compiler
        // [INCOMPATIBLE_TYPES] Incompatible types: MyKotlinObjectA? and JobState
        when (a) {
            JobState.CANCELED -> {
            }
            else -> throw IllegalStateException()
        }
    }
}
