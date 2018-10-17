package com.example.it_wog.klassendemo

class Users (name : String, nickname: String, alter : Int){
    private val nameNeu = name
    private val nicknameNeu = nickname
    private val alterNeu = alter

    fun gibName () :String {
        return "Der User heißt $nicknameNeu, sein echter Name ist $nameNeu und sein Alter ist ${gibAlter()}"
    }
    //private functions are only in the same class available
    private fun gibAlter () : Int {
        return alterNeu

    }
}