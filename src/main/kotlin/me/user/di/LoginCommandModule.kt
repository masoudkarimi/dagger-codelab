package me.user.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import me.user.Command
import me.user.commands.LoginCommand

@Module
abstract class LoginCommandModule {

    @Binds
    @IntoMap
    @StringKey("login")
    abstract fun loginCommand(command: LoginCommand): Command
}