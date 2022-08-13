package me.luan.fonseca.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )
    println("----somatoria-------")
    println(salarios.somatoria())
    println("------media-----")
    println(salarios.media())
}