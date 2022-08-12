package me.luan.fonseca.collections

fun main() {
    val nomes = Array(3) {" "}
    nomes[0] = "Luan"
    nomes[1] = "Lena"
    nomes[2] = "Luiza"

    for (nome in nomes) {
        println(nome)
    }

    println("------------")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Luan", "Lena", "Luiza")
    println("------------")
    nomes2.sort()
    nomes2.forEach { println(it) }
}