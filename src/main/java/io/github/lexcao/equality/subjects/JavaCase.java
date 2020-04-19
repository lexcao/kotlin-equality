package io.github.lexcao.equality.subjects;

import io.github.lexcao.equality.condition.Subject;
import io.github.lexcao.equality.condition.SubjectType;

import javax.print.attribute.standard.JobState;
import javax.print.attribute.standard.JobStateReason;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

public class JavaCase {

    public static final Subject typeClass = new Subject(MyJavaClassA.class,
            MyJavaClassB.class,
            SubjectType.CLASS,
            "Java_Class",
            "MyJavaClassA()",
            false);

    public static final Subject typeEnum = new Subject(RetentionPolicy.class,
            ElementType.class,
            SubjectType.ENUM,
            "Java_Enum",
            "RetentionPolicy.SOURCE",
            false);

    public static final Subject typeStatic = new Subject(JobState.class,
            JobStateReason.class,
            SubjectType.STATIC,
            "Java_Static",
            "JobState.CANCELED",
            false);
}
