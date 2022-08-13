package me.luan.fonseca.collections

data class Oficineiros(
    val nome: String,
    val salario: Double,
    val tipoContrato: String
    ) {
    override fun toString(): String =
        """
            nome: $nome
            salario: $salario
        """.trimIndent()
}