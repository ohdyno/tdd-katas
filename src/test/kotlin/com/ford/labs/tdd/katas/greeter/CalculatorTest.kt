package com.ford.labs.tdd.katas.greeter

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec
import javax.print.attribute.IntegerSyntax

class CalculatorTest : StringSpec() {
    init {
        "Given empty, returns 0" {
            Calculator().add("") shouldBe 0
        }

        "Given 0, returns 0" {
            Calculator().add("0") shouldBe 0
        }

        "Given 1, return 1" {
            Calculator().add("1") shouldBe 1
        }

        "Given 0,1 return 1" {
            Calculator().add("0,1") shouldBe 1
        }

        "Given 1,1 return 2" {
            Calculator().add("1,1") shouldBe 2
        }

        "Given 10,1 return 11" {
            Calculator().add("10,1") shouldBe 11
        }
    }
}

class Calculator {
    fun add(numbers: String): Int {
        if (numbers.isBlank())
            return 0

        val first = numbers.first().asInt()

        val second =
                if (hasMoreDigits(numbers))
                    numbers.last().asInt()
                else
                    0

        return first + second
    }

    private fun hasMoreDigits(numbers: String): Boolean {
        return numbers.length > 1
    }

}

private fun Char.asInt(): Int {
    return this.toString().toInt()
}
