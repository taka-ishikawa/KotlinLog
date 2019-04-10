package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("taka", 22, "sports")
        val human2 = Human("natsu", 21, "movie")

        human1.say()
        human1.think()

        human2.say()
        human2.think()
    }
}
