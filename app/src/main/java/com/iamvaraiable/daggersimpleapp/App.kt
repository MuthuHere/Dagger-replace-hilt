package com.iamvaraiable.daggersimpleapp

import android.app.Application

class App:Application() {
    lateinit var dataComponent: DataComponent

    override fun onCreate() {
        dataComponent = DaggerDataComponent.builder().build()
        super.onCreate()
    }
}