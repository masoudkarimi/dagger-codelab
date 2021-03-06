package me.user.commands

import me.user.Command
import me.user.Outputter
import me.user.SingleArgCommand
import me.user.db.Database
import javax.inject.Inject

class LoginCommand @Inject constructor(
    private val database: Database,
    private val outputter: Outputter
): SingleArgCommand() {

    init {
        println("Creating a new $this")
    }

    override fun handleArg(userName: String): Command.Status {
        val account = database.getAccount(userName)
        outputter.output("$userName is logged in with balance ${account.balance}")
        return Command.Status.HANDLED
    }
}