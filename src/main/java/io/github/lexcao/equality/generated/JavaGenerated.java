package io.github.lexcao.equality.generated;

import io.github.lexcao.equality.subjects.*;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

import javax.print.attribute.standard.JobState;
import javax.print.attribute.standard.JobStateReason;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

class JavaGenerated {
  void if_Java_Class_To_Java_Class(MyJavaClassB a) {
    if (a.equals(new MyJavaClassA())) {
      // [warning] IDEA
      // 'equals()' between objects of inconvertible types 'MyJavaClassB' and 'MyJavaClassA'
    } else if (a == new MyJavaClassA()) {
      // [error] compiler
      // Operator '==' cannot be applied to 'MyJavaClassB', 'MyJavaClassA'
    }
  }

  void if_Java_Class_To_Kotlin_Class(MyJavaClassA a) {
    if (a.equals(new MyKotlinClassA())) {
      // [warning] IDEA
      // 'equals()' between objects of inconvertible types 'MyJavaClassA' and 'MyKotlinClassA'
    } else if (a == new MyKotlinClassA()) {
      // [error] compiler
      // Operator '==' cannot be applied to 'MyJavaClassA', 'MyKotlinClassA'
    }
  }

  void if_Kotlin_Class_To_Kotlin_Class(MyKotlinClassB a) {
    if (a.equals(new MyKotlinClassA())) {
      // [warning] IDEA
      // 'equals()' between objects of inconvertible types 'MyKotlinClassB' and 'MyKotlinClassA'
    } else if (a == new MyKotlinClassA()) {
      // [error] compiler
      // Operator '==' cannot be applied to 'MyKotlinClassB', 'MyKotlinClassA'
    }
  }

  void if_Nullable_Kotlin_Class_To_Kotlin_Class(MyKotlinClassB a) {
    if (a.equals(new MyKotlinClassA())) {
      // [warning] IDEA
      // 'equals()' between objects of inconvertible types 'MyKotlinClassB' and 'MyKotlinClassA'
    } else if (a == new MyKotlinClassA()) {
      // [error] compiler
      // Operator '==' cannot be applied to 'MyKotlinClassB', 'MyKotlinClassA'
    }
  }

  void if_Nullable_Kotlin_Class_To_Java_Class(MyKotlinClassA a) {
    if (a.equals(new MyJavaClassA())) {
      // [warning] IDEA
      // 'equals()' between objects of inconvertible types 'MyKotlinClassA' and 'MyJavaClassA'
    } else if (a == new MyJavaClassA()) {
      // [error] compiler
      // Operator '==' cannot be applied to 'MyKotlinClassA', 'MyJavaClassA'
    }
  }

  void if_Java_Enum_To_Java_Enum(ElementType a) {
    if (a.equals(RetentionPolicy.SOURCE)) {
      // [warning] IDEA
      // Condition 'a.equals(RetentionPolicy.SOURCE)' is always 'false'
    } else if (a == RetentionPolicy.SOURCE) {
      // [error] compiler
      // Operator '==' cannot be applied to 'ElementType', 'RetentionPolicy'
    }
  }

  void if_Java_Enum_To_Kotlin_Enum(RetentionPolicy a) {
    if (a.equals(AnnotationRetention.SOURCE)) {
      // [warning] IDEA
      // Condition 'a.equals(AnnotationRetention.SOURCE)' is always 'false'
    } else if (a == AnnotationRetention.SOURCE) {
      // [error] compiler
      // Operator '==' cannot be applied to 'RetentionPolicy', 'AnnotationRetention'
    }
  }

  void if_Kotlin_Enum_To_Kotlin_Enum(AnnotationTarget a) {
    if (a.equals(AnnotationRetention.SOURCE)) {
      // [warning] IDEA
      // Condition 'a.equals(AnnotationRetention.SOURCE)' is always 'false'
    } else if (a == AnnotationRetention.SOURCE) {
      // [error] compiler
      // Operator '==' cannot be applied to 'AnnotationTarget', 'AnnotationRetention'
    }
  }

  void if_Nullable_Kotlin_Enum_To_Kotlin_Enum(AnnotationTarget a) {
    if (a.equals(AnnotationRetention.SOURCE)) {
      // [warning] IDEA
      // Condition 'a.equals(AnnotationRetention.SOURCE)' is always 'false'
    } else if (a == AnnotationRetention.SOURCE) {
      // [error] compiler
      // Operator '==' cannot be applied to 'AnnotationTarget', 'AnnotationRetention'
    }
  }

  void if_Nullable_Kotlin_Enum_To_Java_Enum(AnnotationRetention a) {
    if (a.equals(RetentionPolicy.SOURCE)) {
      // [warning] IDEA
      // Condition 'a.equals(RetentionPolicy.SOURCE)' is always 'false'
    } else if (a == RetentionPolicy.SOURCE) {
      // [error] compiler
      // Operator '==' cannot be applied to 'AnnotationRetention', 'RetentionPolicy'
    }
  }

  void if_Java_Static_To_Java_Static(JobStateReason a) {
    if (a.equals(JobState.CANCELED)) {
      // [warning] IDEA
      // 'equals()' between objects of inconvertible types 'JobStateReason' and 'JobState'
    } else if (a == JobState.CANCELED) {
      // [error] compiler
      // Operator '==' cannot be applied to 'JobStateReason', 'JobState'
    }
  }

  void if_Java_Static_To_Kotlin_Static(JobState a) {
    if (a.equals(MyKotlinObjectA.INSTANCE)) {
      // [warning] IDEA
      // 'equals()' between objects of inconvertible types 'JobState' and 'MyKotlinObjectA'
    } else if (a == MyKotlinObjectA.INSTANCE) {
      // [error] compiler
      // Operator '==' cannot be applied to 'JobState', 'MyKotlinObjectA'
    }
  }

  void if_Kotlin_Static_To_Kotlin_Static(MyKotlinObjectB a) {
    if (a.equals(MyKotlinObjectA.INSTANCE)) {
      // [warning] IDEA
      // 'equals()' between objects of inconvertible types 'MyKotlinObjectB' and 'MyKotlinObjectA'
    } else if (a == MyKotlinObjectA.INSTANCE) {
      // [error] compiler
      // Operator '==' cannot be applied to 'MyKotlinObjectB', 'MyKotlinObjectA'
    }
  }

  void if_Nullable_Kotlin_Static_To_Kotlin_Static(MyKotlinObjectB a) {
    if (a.equals(MyKotlinObjectA.INSTANCE)) {
      // [warning] IDEA
      // 'equals()' between objects of inconvertible types 'MyKotlinObjectB' and 'MyKotlinObjectA'
    } else if (a == MyKotlinObjectA.INSTANCE) {
      // [error] compiler
      // Operator '==' cannot be applied to 'MyKotlinObjectB', 'MyKotlinObjectA'
    }
  }

  void if_Nullable_Kotlin_Static_To_Java_Static(MyKotlinObjectA a) {
    if (a.equals(JobState.CANCELED)) {
      // [warning] IDEA
      // 'equals()' between objects of inconvertible types 'MyKotlinObjectA' and 'JobState'
    } else if (a == JobState.CANCELED) {
      // [error] compiler
      // Operator '==' cannot be applied to 'MyKotlinObjectA', 'JobState'
    }
  }

  void switch_Java_Enum_To_Java_Enum(ElementType a) {
    // [error] compiler
    // Required type: ElementType, Provided: RetentionPolicy
    switch (a) {
      case RetentionPolicy.SOURCE:
        break;
      default:
        throw new IllegalStateException();
    }
  }

  void switch_Java_Enum_To_Kotlin_Enum(RetentionPolicy a) {
    // [error] compiler
    // Required type: RetentionPolicy, Provided: AnnotationRetention
    switch (a) {
      case AnnotationRetention.SOURCE:
        break;
      default:
        throw new IllegalStateException();
    }
  }

  void switch_Kotlin_Enum_To_Kotlin_Enum(AnnotationTarget a) {
    // [error] compiler
    // Required type: AnnotationTarget, Provided: AnnotationRetention
    switch (a) {
      case AnnotationRetention.SOURCE:
        break;
      default:
        throw new IllegalStateException();
    }
  }

  void switch_Nullable_Kotlin_Enum_To_Kotlin_Enum(AnnotationTarget a) {
    // [error] compiler
    // Required type: AnnotationTarget, Provided: RetentionPolicy
    switch (a) {
      case AnnotationRetention.SOURCE:
        break;
      default:
        throw new IllegalStateException();
    }
  }

  void switch_Nullable_Kotlin_Enum_To_Java_Enum(AnnotationRetention a) {
    // [error] compiler
    // Required type: AnnotationRetention, Provided: RetentionPolicy
    switch (a) {
      case RetentionPolicy.SOURCE:
        break;
      default:
        throw new IllegalStateException();
    }
  }
}
