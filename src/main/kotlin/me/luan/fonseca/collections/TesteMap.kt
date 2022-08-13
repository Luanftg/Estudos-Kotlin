package me.luan.fonseca.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Luan", 1200.00)
    val map1 = mapOf(pair)

    map1.forEach { (t, u) -> println("Chave: $t - Valor: $u") }

    val map2 = mapOf(
        "Lena" to 2100.00,
        "Luiza" to 1500.00
    )

    map2.forEach { (t, u) -> println("Chave: $t - Valor: $u")  }
}