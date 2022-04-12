package me.user.di

import dagger.Component
import me.user.CommandRouter

@Component(
    modules = [
        UserCommandModule::class,
        HelloWorldModule::class,
        LoginCommandModule::class,
        SystemOutModule::class]
)
interface CommandRouterFactory {
    fun router(): CommandRouter
}