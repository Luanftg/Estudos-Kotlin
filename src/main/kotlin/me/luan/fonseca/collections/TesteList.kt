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

    val oficineiroSetCLT = setOf(lena,luiza)
    val oficineiroSetPJ = setOf(luan)
    val oficineiroSubstract = setOf(luan,lena,luiza)

    println("-----Union---")
    val resultUnion = oficineiroSetCLT.union(oficineiroSetPJ)
    resultUnion.forEach { println(it) }

    println("----Substract----")
    val resultSubstract = oficineiroSubstract.subtract(oficineiroSetPJ)
    resultSubstract.forEach { println(it) }

    println("----Intersect----")
    val resulIntersect = oficineiroSubstract.intersect(oficineiroSetPJ)
    resulIntersect.forEach { println(it) }

}

