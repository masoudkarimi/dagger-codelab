package me.user


abstract class SingleArgCommand: Command {

    override fun handleInput(input: List<String>): Command.Status {
        println("SingleArgCommand input= $input")
        return if (input.size == 1) handleArg(input.first()) else Command.Status.INVALID
    }

    protected abstract fun handleArg(userName: String): Command.Status
}