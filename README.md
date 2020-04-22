Kotlin - Java - equality - playground

This repository explored the equality behaviors on each compiler of Java and Kotlin by using [*JavaPoet*](https://github.com/square/javapoet) and [*KotlinPoet*](https://github.com/square/kotlinpoet) to generate control flow code. 

The original code is on `master` branch while the generated files, [`JavaGenerated.java`](https://github.com/lexcao/kotlin-equality/blob/generated/src/main/java/io/github/lexcao/equality/generated/JavaGenerated.java) and [`KotlinGenerated.kt`](https://github.com/lexcao/kotlin-equality/blob/generated/src/main/kotlin/io/github/lexcao/equality/generated/KotlinGenerated.kt), are on `generated` branch.

## Why equality
I encountered a potentially unexpected equality result when I am coding with Kotlin. Here are some code snippets.

You can read details on this [***blog***](https://lexcao.github.io/zh/posts/kotlin-equality-diving), if you are interested.

```kotlin
// say we have a enum 
enum class MyState {
    SUCCESS, CANCELED;
}

// here to get MyState, the ? is important to reproduce
fun getMyState(): MyState? = TODO()

// when using it
fun doSomething() {
    val state = getMyState()
    if (state == CANCELED) {
        // It seems compiling success
    }
}

// but what I made is that
// a wrong CANCELED value of enum is static imported by mistake
// public static final JobState CANCELED = new JobState (7);
import javax.print.attribute.standard.JobState.CANCELED

// and the code still compiles successfully
if (state == CANCELED) {
    // when it runs, the code will never reach here
}
```

The question is:
why the Kotlin nullable enum can equal to Java static class without compiling error by Kotlin compiler or warning `INCOMPATIBLE_ENUM_COMPARISON` by IDEA?

## Solution
Why this happens?

```
In Kotlin, equality is like this:
a == b => a?.equals(b) ?: (b === null)
a === b => a and b point to the same object
```
1. All Kotlin enums are compiled to `Enum<E : Enum<E>>`;
2. The `null` info of the java static object `JobState.CANCELED` is unknown;
3. It would compile successfully when executing on condition of `b === null` between two `nullable` type.

If like this: 
```kolitn
// Tell the `null` info of Java class to compiler
// [INCOMPATIBLE_ENUM_COMPARISON] would be warning friendly by IDEA
fun if_NullableKotlinEnum_To_JavaStatic(a: AnnotationRetention?) {
    // Use !! to tell compiler explicitly that the `null` info is NotNull
    if (a == JobState.CANCELED!!) {
        // [INCOMPATIBLE_ENUM_COMPARISON] Comparison of incompatible enums 
        // 'AnnotationRetention?' and 'JobState' is always unsuccessful
    }
}
```

