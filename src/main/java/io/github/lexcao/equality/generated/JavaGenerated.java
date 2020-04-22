package io.github.lexcao.equality.generated;

import io.github.lexcao.equality.subjects.*;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

import javax.print.attribute.standard.JobState;
import javax.print.attribute.standard.JobStateReason;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

class JavaGenerated {
  void if_JavaClass_To_JavaClass(MyJavaClassB a) {
    if (a.equals(new MyJavaClassA())) {
    } else if (a == new MyJavaClassA()) {
    }
  }

  void if_JavaClass_To_KotlinClass(MyJavaClassA a) {
    if (a.equals(new MyKotlinClassA())) {
    } else if (a == new MyKotlinClassA()) {
    }
  }

  void if_KotlinClass_To_KotlinClass(MyKotlinClassB a) {
    if (a.equals(new MyKotlinClassA())) {
    } else if (a == new MyKotlinClassA()) {
    }
  }

  void if_NullableKotlinClass_To_KotlinClass(MyKotlinClassB a) {
    if (a.equals(new MyKotlinClassA())) {
    } else if (a == new MyKotlinClassA()) {
    }
  }

  void if_NullableKotlinClass_To_JavaClass(MyKotlinClassA a) {
    if (a.equals(new MyJavaClassA())) {
    } else if (a == new MyJavaClassA()) {
    }
  }

  void if_JavaEnum_To_JavaEnum(ElementType a) {
    if (a.equals(RetentionPolicy.SOURCE)) {
    } else if (a == RetentionPolicy.SOURCE) {
    }
  }

  void if_JavaEnum_To_KotlinClass(RetentionPolicy a) {
    if (a.equals(new MyKotlinClassA())) {
    } else if (a == new MyKotlinClassA()) {
    }
  }

  void if_NullableKotlinClass_To_JavaEnum(MyKotlinClassA a) {
    if (a.equals(RetentionPolicy.SOURCE)) {
    } else if (a == RetentionPolicy.SOURCE) {
    }
  }

  void if_JavaStatic_To_JavaStatic(JobStateReason a) {
    if (a.equals(JobState.CANCELED)) {
    } else if (a == JobState.CANCELED) {
    }
  }

  void if_JavaStatic_To_KotlinClass(JobState a) {
    if (a.equals(new MyKotlinClassA())) {
    } else if (a == new MyKotlinClassA()) {
    }
  }

  void if_NullableKotlinClass_To_JavaStatic(MyKotlinClassA a) {
    if (a.equals(JobState.CANCELED)) {
    } else if (a == JobState.CANCELED) {
    }
  }

  void if_JavaClass_To_KotlinEnum(MyJavaClassA a) {
    if (a.equals(AnnotationRetention.SOURCE)) {
    } else if (a == AnnotationRetention.SOURCE) {
    }
  }

  void if_KotlinEnum_To_KotlinEnum(AnnotationTarget a) {
    if (a.equals(AnnotationRetention.SOURCE)) {
    } else if (a == AnnotationRetention.SOURCE) {
    }
  }

  void if_NullableKotlinEnum_To_KotlinEnum(AnnotationTarget a) {
    if (a.equals(AnnotationRetention.SOURCE)) {
    } else if (a == AnnotationRetention.SOURCE) {
    }
  }

  void if_NullableKotlinEnum_To_JavaClass(AnnotationRetention a) {
    if (a.equals(new MyJavaClassA())) {
    } else if (a == new MyJavaClassA()) {
    }
  }

  void if_JavaEnum_To_KotlinEnum(RetentionPolicy a) {
    if (a.equals(AnnotationRetention.SOURCE)) {
    } else if (a == AnnotationRetention.SOURCE) {
    }
  }

  void if_NullableKotlinEnum_To_JavaEnum(AnnotationRetention a) {
    if (a.equals(RetentionPolicy.SOURCE)) {
    } else if (a == RetentionPolicy.SOURCE) {
    }
  }

  void if_JavaStatic_To_KotlinEnum(JobState a) {
    if (a.equals(AnnotationRetention.SOURCE)) {
    } else if (a == AnnotationRetention.SOURCE) {
    }
  }

  void if_NullableKotlinEnum_To_JavaStatic(AnnotationRetention a) {
    if (a.equals(JobState.CANCELED)) {
    } else if (a == JobState.CANCELED) {
    }
  }

  void if_JavaClass_To_KotlinStatic(MyJavaClassA a) {
    if (a.equals(MyKotlinObjectA.INSTANCE)) {
    } else if (a == MyKotlinObjectA.INSTANCE) {
    }
  }

  void if_KotlinStatic_To_KotlinStatic(MyKotlinObjectB a) {
    if (a.equals(MyKotlinObjectA.INSTANCE)) {
    } else if (a == MyKotlinObjectA.INSTANCE) {
    }
  }

  void if_NullableKotlinStatic_To_KotlinStatic(MyKotlinObjectB a) {
    if (a.equals(MyKotlinObjectA.INSTANCE)) {
    } else if (a == MyKotlinObjectA.INSTANCE) {
    }
  }

  void if_NullableKotlinStatic_To_JavaClass(MyKotlinObjectA a) {
    if (a.equals(new MyJavaClassA())) {
    } else if (a == new MyJavaClassA()) {
    }
  }

  void if_JavaEnum_To_KotlinStatic(RetentionPolicy a) {
    if (a.equals(MyKotlinObjectA.INSTANCE)) {
    } else if (a == MyKotlinObjectA.INSTANCE) {
    }
  }

  void if_NullableKotlinStatic_To_JavaEnum(MyKotlinObjectA a) {
    if (a.equals(RetentionPolicy.SOURCE)) {
    } else if (a == RetentionPolicy.SOURCE) {
    }
  }

  void if_JavaStatic_To_KotlinStatic(JobState a) {
    if (a.equals(MyKotlinObjectA.INSTANCE)) {
    } else if (a == MyKotlinObjectA.INSTANCE) {
    }
  }

  void if_NullableKotlinStatic_To_JavaStatic(MyKotlinObjectA a) {
    if (a.equals(JobState.CANCELED)) {
    } else if (a == JobState.CANCELED) {
    }
  }
}
