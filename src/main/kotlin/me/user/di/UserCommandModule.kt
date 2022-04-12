package me.user.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import me.user.Command
import me.user.commands.DepositCommand

@Module
abstract class UserCommandModule {

    @Binds
    @IntoMap
    @StringKey("deposit")
    abstract fun helloWorldCommand(command: DepositCommand): Command
}