Kotlin - Java - equality - playground

This repository explored the equality behaviors on each compiler of Java and Kotlin by using [*JavaPoet*](https://github.com/square/javapoet) and [*KotlinPoet*](https://github.com/square/kotlinpoet) to generate control flow code. 

The original code is on `master` branch while the generated files, [`JavaGenerated.java`](https://github.com/lexcao/kotlin-equality/blob/generated/src/main/java/io/github/lexcao/equality/generated/JavaGenerated.java) and [`KotlinGenerated.kt`](https://github.com/lexcao/kotlin-equality/blob/generated/src/main/kotlin/io/github/lexcao/equality/generated/KotlinGenerated.kt), are on `generated` branch.

## Why equality
I encountered a potentially unexpected equality result when I am coding with Kotlin. Here are some code snippets.

// (WIP) You can read details on my blog, if you are interested.

```
// say we hava a enum 
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
My question is:
* Why they compile successfully?
* Why the compiler could not tell me unsuccessful condition at compilation time or giving a warning from IDEA just like that when equaling between two enums, there is a warning said `INCOMPATIBLE_ENUM_COMPARISON`.
* Is that a wrong code?

## Why compiles successfully?
(WIP)

