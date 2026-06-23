package io.github.kevinah95.kmpkoin.di

import org.koin.core.context.startKoin

fun initKoin(config: KoinAppDeclaration? = null){
    startKoin {
        includes(config)
        modules(dataModule)
    }
}