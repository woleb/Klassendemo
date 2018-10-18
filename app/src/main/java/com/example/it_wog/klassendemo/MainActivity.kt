package com.example.it_wog.klassendemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //first object generation
        val u712 = Users(name="Tom", nickname="Game" , alter=24)
        Log.i("Test","${ u712.gibName()}")

        //second object generation
        val u713 = Users(name2Constructor = "Thomas")
        Log.i("Test","${ u713.gibName()}")

    }

}
