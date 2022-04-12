package me.user.di

import dagger.Component
import me.user.CommandRouter
import javax.inject.Singleton

@Component(
    modules = [
        UserCommandModule::class,
        HelloWorldModule::class,
        LoginCommandModule::class,
        SystemOutModule::class]
)
@Singleton
interface CommandRouterFactory {
    fun router(): CommandRouter
}