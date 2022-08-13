package me.luan.fonseca.collections

fun main() {
    val salarios = DoubleArray(3)
    println("------Salário Base:------")
    salarios[0] = 1000.00
    salarios[1] = 3000.00
    salarios[2] = 500.00

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.10
    }
    println("------Salários Aumentados:------")
    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(1500.00,1200.00,800.00)

    salarios2.forEach { println(it) }


}