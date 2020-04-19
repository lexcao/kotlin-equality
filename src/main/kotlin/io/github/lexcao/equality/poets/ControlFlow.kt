package io.github.lexcao.equality.poets

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.MethodSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.asClassName
import io.github.lexcao.equality.JavaParam
import io.github.lexcao.equality.KotlinParam
import io.github.lexcao.equality.condition.Subject

interface ControlFlow<Method, Param> {

    val flow: Method
    val param: Param

    interface KotlinCF : ControlFlow<FunSpec, KotlinParam>
    interface JavaCF : ControlFlow<MethodSpec, JavaParam>

    /**
     *  If control flow in Kotlin
     */
    class IfK(
        name: String,
        pair: Pair<Subject<*>, Subject<*>>
    ) : KotlinCF {

        override val param: KotlinParam = KotlinParam(
            "a", pair.first
                .type.asClassName().copy(nullable = pair.first.nullable)
        )

        override val flow: FunSpec by lazy {
            kotlinFlow(name, "if (${param.name} == ${pair.second.value})", param)
        }

        override fun toString(): String {
            return flow.toString()
        }
    }

    /**
     *  When control flow in Kotlin
     */
    class WhenK(
        name: String,
        pair: Pair<Subject<*>, Subject<*>>
    ) : KotlinCF {

        override val param: KotlinParam = KotlinParam(
            "a", pair.first
                .type.asClassName().copy(nullable = pair.first.nullable)
        )

        override val flow: FunSpec by lazy {
            kotlinFlow(name, "when (${param.name})", param) {
                addStatement("${pair.second.value} -> {}")
                addStatement("else -> throw IllegalStateException()")
            }
        }
    }

    /**
     *  If control flow in Java
     */
    class IfJ(
        name: String,
        pair: Pair<Subject<*>, Subject<*>>
    ) : JavaCF {

        override val param: JavaParam = JavaParam.builder(ClassName.get(pair.first.type), "a").build()

        override val flow: MethodSpec by lazy {
            javaFlow(name, "if (${param.name}.equals(${pair.second.javaValue()}))", param)
        }
    }

    /**
     *  Switch control flow in Java
     *  Only support enum class / String / primitive
     */
    class SwitchJ(
        name: String,
        pair: Pair<Subject<*>, Subject<*>>
    ) : JavaCF {

        override val param: JavaParam = JavaParam.builder(ClassName.get(pair.first.type), "a").build()

        override val flow: MethodSpec by lazy {
            javaFlow(name, "switch (${param.name})", param) {
                addStatement("case ${pair.second.javaValue()}: break")
                addStatement("default: throw new IllegalStateException()")
            }
        }
    }

    companion object {
        private fun kotlinFlow(
            name: String,
            flow: String,
            param: KotlinParam,
            block: FunSpec.Builder.() -> Unit = {}
        ): FunSpec {
            return FunSpec.builder(name)
                .addParameter(param)
                .beginControlFlow(flow)
                .apply(block)
                .endControlFlow()
                .build()
        }

        private fun javaFlow(
            name: String,
            flow: String,
            param: JavaParam,
            block: MethodSpec.Builder.() -> Unit = {}
        ): MethodSpec {
            return MethodSpec.methodBuilder(name)
                .addParameter(param)
                .beginControlFlow(flow)
                .apply(block)
                .endControlFlow()
                .build()
        }
    }
}