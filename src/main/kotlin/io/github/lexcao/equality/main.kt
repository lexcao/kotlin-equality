package io.github.lexcao.equality

import io.github.lexcao.equality.condition.Cases
import io.github.lexcao.equality.poets.Poet
import java.io.File

typealias KotlinType = com.squareup.kotlinpoet.TypeSpec
typealias KotlinParam = com.squareup.kotlinpoet.ParameterSpec
typealias JavaType = com.squareup.javapoet.TypeSpec
typealias JavaParam = com.squareup.javapoet.ParameterSpec

const val Kotlin_Output_Folder = "src/main/kotlin/"
const val Java_Output_Folder = "src/main/java/"

fun main() {
    Poet.Kotlin()
        .addFunctions(Cases.kotlinFunctions())
        .write(File(Kotlin_Output_Folder))

    Poet.Java()
        .addFunctions(Cases.javaMethods())
        .write(File(Java_Output_Folder))
}