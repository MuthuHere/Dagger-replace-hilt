package com.iamvaraiable.daggersimpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iamvariable.daggersimpleapp.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var dataSource: DataSource
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as App).dataComponent.inject(this)

        dataSource.getUserData()
    }
}