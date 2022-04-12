package me.user.db

import java.math.BigDecimal

data class Account(
    val userName: String,
    var balance: BigDecimal = BigDecimal.ZERO
) {
    fun deposit(deposit: BigDecimal) {
        balance += deposit
    }
}
