package me.user.di

import dagger.Binds
import dagger.Module
import me.user.Command
import me.user.commands.HelloWorldCommand

@Module
abstract class HelloWorldModule {

    @Binds
    abstract fun helloWorldCommand(command: HelloWorldCommand): Command
}