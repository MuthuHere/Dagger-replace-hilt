package com.iamvaraiable.daggersimpleapp

import dagger.Component


@Component(modules = [DataModule::class])
interface DataComponent  {

    fun inject(mainActivity: MainActivity)
}