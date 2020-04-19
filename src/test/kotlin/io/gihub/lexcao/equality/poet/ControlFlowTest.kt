package io.gihub.lexcao.equality.poet

import io.github.lexcao.equality.condition.Subject
import io.github.lexcao.equality.poets.ControlFlow
import io.github.lexcao.equality.subjects.MyKotlinClass
import org.junit.Assert.assertEquals
import org.junit.Test

class ControlFlowTest {

    val a = Subject(MyKotlinClass::class.java, "Kotlin_Class", "MyKotlinClass()")
    val b = Subject(MyKotlinClass::class.java, "Kotlin_Class", "MyKotlinClass()")
    val fullClassName = MyKotlinClass::class.java.canonicalName

    @Test
    fun testNullableIfK() {
        val function = ControlFlow.IfK("kotlinIf", a.copy(nullable = true) to b)
        assertEquals(
            """
            fun kotlinIf(a: $fullClassName?) {
              if (a == MyKotlinClass()) {
              }
            }
            
        """.trimIndent(), function.toString()
        )

    }

    @Test
    fun testIfK() {
        val function = ControlFlow.IfK("kotlinIf", a to b)
        assertEquals(
            """
            fun kotlinIf(a: $fullClassName) {
              if (a == MyKotlinClass()) {
              }
            }
            
        """.trimIndent(), function.toString()
        )
    }

    @Test
    fun testWhenK() {
        val function = ControlFlow.WhenK("kotlinWhen", a to b)
        assertEquals(
            """
            fun kotlinWhen(a: $fullClassName) {
              when (a) {
                MyKotlinClass() -> {}
                else -> throw IllegalStateException()
              }
            }
            
        """.trimIndent(), function.toString()
        )
    }

    @Test
    fun testIfJ() {
        val method = ControlFlow.IfJ("javaIf", a to b)
        assertEquals(
            """
            void javaIf($fullClassName a) {
              if (a == new MyKotlinClass()) {
              }
            }
            
        """.trimIndent(), method.toString()
        )
    }

    @Test
    fun testSwitchJ() {
        val function = ControlFlow.SwitchJ("javaSwitch", a to b)
        assertEquals(
            """
            void javaSwitch($fullClassName a) {
              switch (a) {
                case new MyKotlinClass(): break;
                default: throw new IllegalStateException();
              }
            }
            
        """.trimIndent(), function.toString()
        )
    }
}