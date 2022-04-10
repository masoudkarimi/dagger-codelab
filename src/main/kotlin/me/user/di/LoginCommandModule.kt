package me.user.di

import dagger.Binds
import dagger.Module
import me.user.Command
import me.user.commands.LoginCommand

@Module
abstract class LoginCommandModule {

    @Binds
    abstract fun loginCommand(command: LoginCommand): Command
}