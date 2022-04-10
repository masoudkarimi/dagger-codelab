package me.user.di

import dagger.Module
import dagger.Provides
import me.user.Outputter

@Module
object SystemOutModule {

    @JvmStatic
    @Provides
    fun textOutputter(): Outputter {
        return object : Outputter {
            override fun output(output: String) {
                println(output)
            }
        }
    }

}