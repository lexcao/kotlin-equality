package io.github.lexcao.equality.condition

data class Subject(
    val type: Class<out Any>,
    private val backup: Class<out Any>,
    private val name: String,
    val value: String,
    var nullable: Boolean = false
) {

    fun javaValue(): String = if (name.endsWith("Class")) {
        "new $value"
    } else if (name.startsWith("Kotlin") && name.endsWith("Static")) {
        "$value.INSTANCE"
    } else {
        value
    }

    fun nullable(): Subject = this.copy(nullable = true)
    fun backup(): Subject = this.copy(type = this.backup, backup = this.type)


    override fun toString(): String {
        return if (nullable) "Nullable_$name" else name
    }
}