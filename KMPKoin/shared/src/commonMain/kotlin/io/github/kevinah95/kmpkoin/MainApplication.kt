package io.github.kevinah95.kmpkoin

import android.app.Application

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Aquí inicializaremos Koin
        initKoin()
    }
}