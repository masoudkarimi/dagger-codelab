package me.user

import javax.inject.Inject

class CommandRouter @Inject constructor(
    private val command: Command
) {

    private val commands: HashMap<String, Command> = HashMap()

    init {
        commands[command.key()] = command
    }

    fun route(input: String): Command.Status {
        println("Command received $input")
        println("Commands size= ${commands.size}")

        val splitInput = split(input)
        println("Split commands= $splitInput, size= ${splitInput.size}")
        if (splitInput.isEmpty()) {
            return invalidCommand(input)
        }
        val commandKey = splitInput[0]
        val command = commands[commandKey] ?: return invalidCommand(input)
        val status = command.handleInput(splitInput.subList(1, splitInput.size))
        if (status === Command.Status.INVALID) {
            println("$commandKey: invalid arguments")
        }
        return status
    }

    private fun invalidCommand(input: String): Command.Status {
        println(String.format("couldn't understand \"%s\". please try again.", input))
        return Command.Status.INVALID
    }

    companion object {
        // Split on whitespace
        private fun split(string: String): List<String> {
            return string.split(" ")
        }
    }
}