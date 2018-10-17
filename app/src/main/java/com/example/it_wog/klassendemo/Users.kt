package com.example.it_wog.klassendemo

class Users (name : String, nickname: String, alter : Int){
    val nameNeu = name
    val nicknameNeu = nickname
    val alterNeu = alter

    fun gibName () :String {
        return "Der User heißt $nicknameNeu, sein echter Name ist $nameNeu"
    }
}