package io.gihub.lexcao.equality.poet

import io.github.lexcao.equality.condition.Subject
import io.github.lexcao.equality.poets.ControlFlow
import io.github.lexcao.equality.poets.Poet
import io.github.lexcao.equality.subjects.MyKotlinClass
import org.junit.Assert
import org.junit.Test

class PoetTest {

    val a = Subject(MyKotlinClass::class.java, "Kotlin_Class", "MyKotlinClass()")
    val b = Subject(MyKotlinClass::class.java, "Kotlin_Class", "MyKotlinClass()")

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
                
                import io.github.lexcao.equality.subjects.MyKotlinClass
            
                class TestGenerated {
                  fun testIf(a: MyKotlinClass) {
                    if (a == MyKotlinClass()) {
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
                
                import io.github.lexcao.equality.subjects.MyKotlinClass;
            
                class TestGenerated {
                  void testIf(MyKotlinClass a) {
                    if (a == new MyKotlinClass()) {
                    }
                  }
                }
                
            """.trimIndent(), javaPoet.toString()
        )

    }
}