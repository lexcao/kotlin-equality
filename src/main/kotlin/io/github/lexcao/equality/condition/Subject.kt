package io.github.lexcao.equality.condition

data class Subject<T>(
    val type: Class<T>,
    val name: String,
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

    fun nullable(): Subject<T> = this.copy(nullable = true)

    override fun toString(): String {
        return if (nullable) "Nullable_$name" else name
    }
}