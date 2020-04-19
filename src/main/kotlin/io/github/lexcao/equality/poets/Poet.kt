package io.github.lexcao.equality.poets

import com.squareup.javapoet.JavaFile
import com.squareup.javapoet.MethodSpec
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import io.github.lexcao.equality.JavaParam
import io.github.lexcao.equality.JavaType
import io.github.lexcao.equality.KotlinParam
import io.github.lexcao.equality.KotlinType
import java.io.File
import java.util.LinkedList

sealed class Poet<FILE, FUNC, PARAM>(
    protected val name: String,
    protected val packageName: String
) {

    abstract fun read(): FILE
    abstract fun write(file: File)
    protected abstract val poetFile: FILE

    protected val functions: LinkedList<ControlFlow<FUNC, PARAM>> = LinkedList()
    fun addFunctions(flow: List<ControlFlow<FUNC, PARAM>>): Poet<FILE, FUNC, PARAM> {
        functions += flow
        return this
    }

    override fun toString(): String {
        return read().toString()
    }

    /**
     *  Kotlin Poet
     */
    class Kotlin(
        name: String = "KotlinGenerated",
        packageName: String = "io.github.lexcao.equality.generated"
    ) : Poet<FileSpec, FunSpec, KotlinParam>(name, packageName) {

        override val poetFile: FileSpec
            get() {
                val classType = KotlinType.classBuilder(name)
                    .addFunctions(functions.map { it.flow })
                    .build()

                return FileSpec.builder(packageName, name)
                    .addType(classType)
                    .build()
            }

        override fun read(): FileSpec = poetFile

        override fun write(file: File) {
            this.poetFile.writeTo(file)
        }
    }

    /**
     *  Java Poet
     */
    class Java(
        name: String = "JavaGenerated",
        packageName: String = "io.github.lexcao.equality.generated"
    ) : Poet<JavaFile, MethodSpec, JavaParam>(name, packageName) {

        override val poetFile: JavaFile
            get() {
                val classType = JavaType.classBuilder(name)
                    .addMethods(functions.map { it.flow })
                    .build()

                return JavaFile.builder(packageName, classType)
                    .build()
            }

        override fun read(): JavaFile = poetFile

        override fun write(file: File) {
            this.poetFile.writeTo(file)
        }
    }
}