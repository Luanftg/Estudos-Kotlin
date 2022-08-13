package me.luan.fonseca.collections

import kotlin.math.roundToInt

fun main() {
    val salarios2 = doubleArrayOf(1500.00,1200.00,800.00)

    salarios2.forEach { println(it) }

    println("----------------")
    println("Média Salarial: R$ ${salarios2.average().roundToInt()}")
    println("Maior salário: ${salarios2.maxOrNull()}")
    println("Menor salario: ${salarios2.minOrNull()}")
    println("Número de salários: ${salarios2.count()}")
    println("Salários acima de R$ 1.000,00: ${salarios2.find { it > 1000.00 }}")
    println("Tem salário de R$ 1.200,00: ${salarios2.filter { it == 1200.00 }}")
    println("Salários de R$ 1.000,00: ${salarios2.any { it > 1000.00 }}")
}