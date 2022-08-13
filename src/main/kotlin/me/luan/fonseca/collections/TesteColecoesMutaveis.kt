package me.luan.fonseca.collections

fun main() {
    val luan = Oficineiros("Luan",1100.00,"PJ")
    val lena = Oficineiros("Lena",1500.00,"CLT")
    val luiza = Oficineiros("Luiza",1200.00,"CLT")

    val oficineiros = mutableListOf(lena, luiza)
    oficineiros.forEach { println(it) }

    println("------Add---------")
    oficineiros.add(luan)
    oficineiros.forEach { println(it) }

    println("-------Remove------")
    oficineiros.remove(luan)
    oficineiros.forEach { println(it) }

    println("------FIM DE LIST---------")
    println("------Set Add------------")
    val oficineirosSet = mutableSetOf(lena, luiza)
    oficineirosSet.add(luan)
    oficineirosSet.forEach { println(it) }
    println("------Set Remove---------")
    oficineirosSet.remove(luan)
    oficineirosSet.forEach { println(it) }

}