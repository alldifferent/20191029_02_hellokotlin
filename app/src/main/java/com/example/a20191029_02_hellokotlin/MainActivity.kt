package com.example.a20191029_02_hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("코틀린기초", "Hello World!!")

        var num1 = 10
        Log.d("코틀린기초", num1.toString())

        val pi = 3.14
        Log.d("코틀린기초", pi.toString())

        var num2: Int
        num2 = 20
        Log.d("코틀린기초", num2.toString())

        var num5 = null
        Log.d("코틀린기초", num5.toString())
    }
}
