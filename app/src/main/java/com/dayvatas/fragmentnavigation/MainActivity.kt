package com.dayvatas.fragmentnavigation

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun button1clicked(view : View){
        val fragmentManager = supportFragmentManager
    }
    fun button2clicked(view : View){

    }
}