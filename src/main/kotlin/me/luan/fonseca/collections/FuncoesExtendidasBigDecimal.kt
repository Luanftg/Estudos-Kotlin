package me.luan.fonseca.collections

import java.math.BigDecimal

    fun Array<BigDecimal>.somatoria() = this.reduce {
        acc,valor -> acc + valor
    }

    fun Array<BigDecimal>.media(): BigDecimal =
        if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()
