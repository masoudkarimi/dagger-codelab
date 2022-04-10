package me.user.di

import dagger.Component
import me.user.CommandRouter

@Component(modules = [LoginCommandModule::class, SystemOutModule::class])
interface CommandRouterFactory {
    fun router(): CommandRouter
}