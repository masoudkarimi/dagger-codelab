package me.user.db

import javax.inject.Inject

class Database @Inject constructor(

) {
    private val accounts: MutableMap<String, @JvmSuppressWildcards Account> = HashMap()

    fun getAccount(userName: String) : Account {
        return accounts.computeIfAbsent(userName) { Account(userName = userName) }
    }
}