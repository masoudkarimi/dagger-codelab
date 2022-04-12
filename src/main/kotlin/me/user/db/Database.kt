package me.user.db

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Database @Inject constructor(

) {
    init {
        println("Creating a new $this")
    }

    private val accounts: MutableMap<String, @JvmSuppressWildcards Account> = HashMap()

    fun getAccount(userName: String) : Account {
        return accounts.computeIfAbsent(userName) {
            Account(userName = userName)
        }
    }
}