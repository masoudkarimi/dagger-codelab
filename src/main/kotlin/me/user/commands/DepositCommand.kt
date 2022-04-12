package me.user.commands

import me.user.Command
import me.user.Outputter
import me.user.db.Database
import java.math.BigDecimal
import javax.inject.Inject

class DepositCommand @Inject constructor(
    private val database: Database,
    private val outputter: Outputter
) : Command {

    init {
        println("Creating a new $this")
    }

    override fun handleInput(input: List<String>): Command.Status {
        if (input.size != 2) {
            return Command.Status.INVALID
        }

        val user = input.first()

        val account = database.getAccount(user)

        account.deposit(BigDecimal(input[1]))
        outputter.output("${account.userName} now has: ${account.balance}")

        return Command.Status.HANDLED
    }
}