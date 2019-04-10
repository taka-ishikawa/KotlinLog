package com.example.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {


    var hobby: String


    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        this.name = name
        this.age = age
        this.hobby = hobby
    }


    override fun think() {
        Log.d("kotlintest", "「私は" + hobby + "について考える。」" )
    }


    override fun say() {
        Log.d("kotlintest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」")
    }
}