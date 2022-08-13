package me.luan.fonseca.collections

fun main() {
    val luan = Oficineiros("Luan",1100.00,"PJ")
    val lena = Oficineiros("Lena",1500.00,"CLT")
    val luiza = Oficineiros("Luiza",1200.00,"CLT")

    val oficineiros = listOf(luan,lena,luiza)
    oficineiros.forEach { println(it) }
    println("--------")
    println(oficineiros.find { it.nome == "Luan" })
    println("--------")
    oficineiros
        .groupBy { it.tipoContrato }
        //.sortedBy { it.salario }
        .forEach { println( it ) }
    println("--------")
    oficineiros

}

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