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
  fun if_JavaClass_To_JavaClass(a: MyJavaClassB) {
    if (a == MyJavaClassA()) {
    }
  }

  fun if_JavaClass_To_KotlinClass(a: MyJavaClassA) {
    if (a == MyKotlinClassA()) {
    }
  }

  fun if_KotlinClass_To_KotlinClass(a: MyKotlinClassB) {
    if (a == MyKotlinClassA()) {
    }
  }

  fun if_NullableKotlinClass_To_KotlinClass(a: MyKotlinClassB?) {
    if (a == MyKotlinClassA()) {
    }
  }

  fun if_NullableKotlinClass_To_JavaClass(a: MyKotlinClassA?) {
    if (a == MyJavaClassA()) {
    }
  }

  fun if_JavaEnum_To_JavaEnum(a: ElementType) {
    if (a == RetentionPolicy.SOURCE) {
    }
  }

  fun if_JavaEnum_To_KotlinClass(a: RetentionPolicy) {
    if (a == MyKotlinClassA()) {
    }
  }

  fun if_NullableKotlinClass_To_JavaEnum(a: MyKotlinClassA?) {
    if (a == RetentionPolicy.SOURCE) {
    }
  }

  fun if_JavaStatic_To_JavaStatic(a: JobStateReason) {
    if (a == JobState.CANCELED) {
    }
  }

  fun if_JavaStatic_To_KotlinClass(a: JobState) {
    if (a == MyKotlinClassA()) {
    }
  }

  fun if_NullableKotlinClass_To_JavaStatic(a: MyKotlinClassA?) {
    if (a == JobState.CANCELED) {
    }
  }

  fun if_JavaClass_To_KotlinEnum(a: MyJavaClassA) {
    if (a == AnnotationRetention.SOURCE) {
    }
  }

  fun if_KotlinEnum_To_KotlinEnum(a: AnnotationTarget) {
    if (a == AnnotationRetention.SOURCE) {
    }
  }

  fun if_NullableKotlinEnum_To_KotlinEnum(a: AnnotationTarget?) {
    if (a == AnnotationRetention.SOURCE) {
    }
  }

  fun if_NullableKotlinEnum_To_JavaClass(a: AnnotationRetention?) {
    if (a == MyJavaClassA()) {
    }
  }

  fun if_JavaEnum_To_KotlinEnum(a: RetentionPolicy) {
    if (a == AnnotationRetention.SOURCE) {
    }
  }

  fun if_NullableKotlinEnum_To_JavaEnum(a: AnnotationRetention?) {
    if (a == RetentionPolicy.SOURCE) {
    }
  }

  fun if_JavaStatic_To_KotlinEnum(a: JobState) {
    if (a == AnnotationRetention.SOURCE) {
    }
  }

  fun if_NullableKotlinEnum_To_JavaStatic(a: AnnotationRetention?) {
    if (a == JobState.CANCELED) {
    }
  }

  fun if_JavaClass_To_KotlinStatic(a: MyJavaClassA) {
    if (a == MyKotlinObjectA) {
    }
  }

  fun if_KotlinStatic_To_KotlinStatic(a: MyKotlinObjectB) {
    if (a == MyKotlinObjectA) {
    }
  }

  fun if_NullableKotlinStatic_To_KotlinStatic(a: MyKotlinObjectB?) {
    if (a == MyKotlinObjectA) {
    }
  }

  fun if_NullableKotlinStatic_To_JavaClass(a: MyKotlinObjectA?) {
    if (a == MyJavaClassA()) {
    }
  }

  fun if_JavaEnum_To_KotlinStatic(a: RetentionPolicy) {
    if (a == MyKotlinObjectA) {
    }
  }

  fun if_NullableKotlinStatic_To_JavaEnum(a: MyKotlinObjectA?) {
    if (a == RetentionPolicy.SOURCE) {
    }
  }

  fun if_JavaStatic_To_KotlinStatic(a: JobState) {
    if (a == MyKotlinObjectA) {
    }
  }

  fun if_NullableKotlinStatic_To_JavaStatic(a: MyKotlinObjectA?) {
    if (a == JobState.CANCELED) {
    }
  }

  fun when_JavaClass_To_JavaClass(a: MyJavaClassB) {
    when (a) {
      MyJavaClassA() -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_JavaClass_To_KotlinClass(a: MyJavaClassA) {
    when (a) {
      MyKotlinClassA() -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_KotlinClass_To_KotlinClass(a: MyKotlinClassB) {
    when (a) {
      MyKotlinClassA() -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinClass_To_KotlinClass(a: MyKotlinClassB?) {
    when (a) {
      MyKotlinClassA() -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinClass_To_JavaClass(a: MyKotlinClassA?) {
    when (a) {
      MyJavaClassA() -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_JavaEnum_To_JavaEnum(a: ElementType) {
    when (a) {
      RetentionPolicy.SOURCE -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_JavaEnum_To_KotlinClass(a: RetentionPolicy) {
    when (a) {
      MyKotlinClassA() -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinClass_To_JavaEnum(a: MyKotlinClassA?) {
    when (a) {
      RetentionPolicy.SOURCE -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_JavaStatic_To_JavaStatic(a: JobStateReason) {
    when (a) {
      JobState.CANCELED -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_JavaStatic_To_KotlinClass(a: JobState) {
    when (a) {
      MyKotlinClassA() -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinClass_To_JavaStatic(a: MyKotlinClassA?) {
    when (a) {
      JobState.CANCELED -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_JavaClass_To_KotlinEnum(a: MyJavaClassA) {
    when (a) {
      AnnotationRetention.SOURCE -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_KotlinEnum_To_KotlinEnum(a: AnnotationTarget) {
    when (a) {
      AnnotationRetention.SOURCE -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinEnum_To_KotlinEnum(a: AnnotationTarget?) {
    when (a) {
      AnnotationRetention.SOURCE -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinEnum_To_JavaClass(a: AnnotationRetention?) {
    when (a) {
      MyJavaClassA() -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_JavaEnum_To_KotlinEnum(a: RetentionPolicy) {
    when (a) {
      AnnotationRetention.SOURCE -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinEnum_To_JavaEnum(a: AnnotationRetention?) {
    when (a) {
      RetentionPolicy.SOURCE -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_JavaStatic_To_KotlinEnum(a: JobState) {
    when (a) {
      AnnotationRetention.SOURCE -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinEnum_To_JavaStatic(a: AnnotationRetention?) {
    when (a) {
      JobState.CANCELED -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_JavaClass_To_KotlinStatic(a: MyJavaClassA) {
    when (a) {
      MyKotlinObjectA -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_KotlinStatic_To_KotlinStatic(a: MyKotlinObjectB) {
    when (a) {
      MyKotlinObjectA -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinStatic_To_KotlinStatic(a: MyKotlinObjectB?) {
    when (a) {
      MyKotlinObjectA -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinStatic_To_JavaClass(a: MyKotlinObjectA?) {
    when (a) {
      MyJavaClassA() -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_JavaEnum_To_KotlinStatic(a: RetentionPolicy) {
    when (a) {
      MyKotlinObjectA -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinStatic_To_JavaEnum(a: MyKotlinObjectA?) {
    when (a) {
      RetentionPolicy.SOURCE -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_JavaStatic_To_KotlinStatic(a: JobState) {
    when (a) {
      MyKotlinObjectA -> {
      }
      else -> throw IllegalStateException()
    }
  }

  fun when_NullableKotlinStatic_To_JavaStatic(a: MyKotlinObjectA?) {
    when (a) {
      JobState.CANCELED -> {
      }
      else -> throw IllegalStateException()
    }
  }
}
