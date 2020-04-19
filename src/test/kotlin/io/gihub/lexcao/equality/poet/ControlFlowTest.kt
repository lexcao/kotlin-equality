package io.gihub.lexcao.equality.poet

import io.github.lexcao.equality.poets.ControlFlow
import io.github.lexcao.equality.subjects.KotlinCase
import io.github.lexcao.equality.subjects.MyKotlinClassA
import io.github.lexcao.equality.subjects.MyKotlinClassB
import org.junit.Assert.assertEquals
import org.junit.Test

class ControlFlowTest {

    val a = KotlinCase.KotlinClass()
    val b = KotlinCase.KotlinClass()
    val fullClassNameA = MyKotlinClassA::class.java.canonicalName
    val fullClassNameB = MyKotlinClassB::class.java.canonicalName

    @Test
    fun testBackupIfK() {
        val function = ControlFlow.IfK("kotlinIf", a.backup() to b)
        assertEquals(
            """
            fun kotlinIf(a: $fullClassNameB) {
              if (a == MyKotlinClassA()) {
              }
            }
            
        """.trimIndent(), function.toString()
        )
    }

    @Test
    fun testNullableIfK() {
        val function = ControlFlow.IfK("kotlinIf", a.nullable() to b)
        assertEquals(
            """
            fun kotlinIf(a: $fullClassNameA?) {
              if (a == MyKotlinClassA()) {
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
            fun kotlinIf(a: $fullClassNameA) {
              if (a == MyKotlinClassA()) {
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
            fun kotlinWhen(a: $fullClassNameA) {
              when (a) {
                MyKotlinClassA() -> {}
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
            void javaIf($fullClassNameA a) {
              if (a.equals(new MyKotlinClassA())) {
              }
              else if (a == new MyKotlinClassA()) {
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
            void javaSwitch($fullClassNameA a) {
              switch (a) {
                case new MyKotlinClassA(): break;
                default: throw new IllegalStateException();
              }
            }
            
        """.trimIndent(), function.toString()
        )
    }
}