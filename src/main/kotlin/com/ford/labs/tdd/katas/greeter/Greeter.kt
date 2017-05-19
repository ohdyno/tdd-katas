package com.ford.labs.tdd.katas.greeter

class Greeter(val name: String) {
    fun greet(): String {
        return "Hello ${name}!"
    }
}