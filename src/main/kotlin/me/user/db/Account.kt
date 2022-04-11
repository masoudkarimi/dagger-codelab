package me.user.db

import java.math.BigDecimal

data class Account(
    val userName: String,
    val balance: BigDecimal = BigDecimal.ZERO
)
