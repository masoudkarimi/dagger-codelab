package me.user.commands

import me.user.Command
import me.user.Outputter
import javax.inject.Inject

class HelloWorldCommand @Inject constructor(
    private val outputter: Outputter
) : Command {

    override fun handleInput(input: List<String>): Command.Status {
        if (input.isEmpty()) {
            return Command.Status.INVALID
        }

        outputter.output("world!")
        return Command.Status.HANDLED
    }
}