package com.ford.labs.tdd.katas.calculator

class Calculator {
    fun add(numbers: String): Int {
        if (numbers.isBlank())
            return 0

        val first = numbers.first().asInt()

        val second = if (hasMoreDigits(numbers)) numbers.last().asInt() else 0

        return first + second
    }

    private fun hasMoreDigits(numbers: String): Boolean {
        return numbers.length > 1
    }

}

private fun Char.asInt(): Int {
    return this.toString().toInt()
}