package io.github.lexcao.equality.condition

interface Subject {

    /**
     *  target class to apply for the left of the condition
     */
    val target: Class<out Any>

    /**
     *  backup class to apply when meets same type
     */
    val backup: Class<out Any>

    val name: String
        get() = this.javaClass.simpleName

    /**
     *  return the Java value of the target
     */
    fun javaValue(): String

    /**
     *  return the Kotlin value of the target
     */
    fun kotlinValue(): String

    fun backup(): Subject
}

interface KotlinSubject : Subject {
    val nullable: Boolean

    override val name: String
        get() = if (nullable) "Nullable" + super.name else super.name

    fun nullable(): KotlinSubject
    override fun backup(): KotlinSubject
}

interface JavaSubject : Subject

interface ClassType
interface EnumType
interface StaticType
