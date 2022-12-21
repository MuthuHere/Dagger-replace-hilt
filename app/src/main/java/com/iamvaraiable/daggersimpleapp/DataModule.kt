package com.iamvaraiable.daggersimpleapp

import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun providesDataSource():DataSource {
        return  DataSource()
    }
}