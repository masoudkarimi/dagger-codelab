package me.user.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import me.user.Command
import me.user.commands.HelloWorldCommand

@Module
abstract class HelloWorldModule {

    @Binds
    @IntoMap
    @StringKey("hello")
    abstract fun helloWorldCommand(command: HelloWorldCommand): Command
}