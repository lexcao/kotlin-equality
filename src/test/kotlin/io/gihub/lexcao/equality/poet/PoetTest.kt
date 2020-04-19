package io.gihub.lexcao.equality.poet

import io.github.lexcao.equality.condition.Subject
import io.github.lexcao.equality.poets.ControlFlow
import io.github.lexcao.equality.poets.Poet
import io.github.lexcao.equality.subjects.MyKotlinClassA
import io.github.lexcao.equality.subjects.MyKotlinClassB
import org.junit.Assert
import org.junit.Test

class PoetTest {

    val a = Subject(MyKotlinClassA::class.java, MyKotlinClassB::class.java, "Kotlin_Class", "MyKotlinClassA()")
    val b = Subject(MyKotlinClassA::class.java, MyKotlinClassB::class.java, "Kotlin_Class", "MyKotlinClassA()")
    val simpleClassNameA = MyKotlinClassA::class.simpleName ?: ""

    @Test
    fun testKotlinPoet() {
        val kotlinPoet = Poet.Kotlin(name = "TestGenerated", packageName = "test")
            .addFunctions(
                listOf(
                    ControlFlow.IfK("testIf", a to b)
                )
            )
        Assert.assertEquals(
            """
                package test
                
                import io.github.lexcao.equality.subjects.$simpleClassNameA
            
                class TestGenerated {
                  fun testIf(a: $simpleClassNameA) {
                    if (a == $simpleClassNameA()) {
                    }
                  }
                }
                
            """.trimIndent(), kotlinPoet.toString()
        )
    }

    @Test
    fun testJavaPoet() {
        val javaPoet = Poet.Java(name = "TestGenerated", packageName = "test")
            .addFunctions(
                listOf(ControlFlow.IfJ("testIf", a to b))
            )

        Assert.assertEquals(
            """
                package test;
                
                import io.github.lexcao.equality.subjects.$simpleClassNameA;
            
                class TestGenerated {
                  void testIf($simpleClassNameA a) {
                    if (a.equals(new $simpleClassNameA())) {
                    }
                    else if (a == new $simpleClassNameA()) {
                    }
                  }
                }
                
            """.trimIndent(), javaPoet.toString()
        )

    }
}