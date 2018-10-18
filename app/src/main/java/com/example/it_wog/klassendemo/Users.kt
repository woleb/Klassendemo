package com.example.it_wog.klassendemo

import android.util.Log

//primärer constructor
class Users (name : String, nickname: String, alter : Int){
    private val nameNeu = name
    private val nicknameNeu = nickname
    private val alterNeu = alter

    //sekundärer constructor
    constructor(name2Constructor: String) : this (name2Constructor, "", 0){
        Log.i("Test", "2.construtor ausgeführt")
    }

    fun gibName () :String {
        return "Der User heißt $nicknameNeu, sein echter Name ist $nameNeu und sein Alter ist ${gibAlter()}"
    }
    //private functions are only in the same class available
    private fun gibAlter () : Int {
        return alterNeu

    }
}