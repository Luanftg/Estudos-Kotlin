package me.luan.fonseca.collections

fun main() {
    val luan = Oficineiros("Luan",1100.00,"PJ")
    val lena = Oficineiros("Lena",1500.00,"CLT")
    val luiza = Oficineiros("Luiza",1200.00,"CLT")

    val repositorio = Repositorio<Oficineiros>()

    repositorio.create(luan.nome,luan)
    repositorio.create(lena.nome,lena)
    repositorio.create(luiza.nome,luiza)

    println("------findById-----")
    println(repositorio.findById(luan.nome))
    println("------findAll-----")
    repositorio.findAll().forEach { println(it) }
    println("------remove-----")
    repositorio.remove(luan.nome)
    repositorio.findAll().forEach { println(it) }
}