package com.dayvatas.fragmentnavigation

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun button1clicked(view : View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val firstFragment = BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout, firstFragment as Fragment).commit()
    }
    fun button2clicked(view : View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val secondFragment = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout, secondFragment as Fragment).commit()
    }
}