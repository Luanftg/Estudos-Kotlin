package me.luan.fonseca.collections

fun main() {
    val values = intArrayOf(1,3,5,2,4,7)

    for (value in values){
        println(value)
    }

    println("---------------")

    values.forEach { value ->
        println(value)
    }
    println("--------------")
    values.sort()
    for (value in values.indices) {
        println(values[value])
    }
}

