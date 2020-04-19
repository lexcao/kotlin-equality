package io.github.lexcao.equality.subjects;

import io.github.lexcao.equality.condition.Subject;

import javax.print.attribute.standard.JobState;
import java.lang.annotation.RetentionPolicy;

public class JavaCase {

    public static final Subject<MyJavaClass> typeClass =
            new Subject<>(MyJavaClass.class, "Java_Class", "MyJavaClass()", false);

    public static final Subject<RetentionPolicy> typeEnum =
            new Subject<>(RetentionPolicy.class, "Java_Enum", "RetentionPolicy.SOURCE", false);

    public static final Subject<JobState> typeStatic =
            new Subject<>(JobState.class, "Java_Static", "JobState.CANCELED", false);
}
