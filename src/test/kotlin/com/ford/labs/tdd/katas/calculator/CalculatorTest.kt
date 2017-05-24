package com.ford.labs.tdd.katas.calculator

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FreeSpec

class CalculatorTests : FreeSpec({
    val calculator = Calculator()

    "Add" - {
        "0 numbers" - {
            "should returns 0" {
                calculator.add("") shouldBe 0
            }
        }

        "1 number" - {
            "should return the input number" {
                calculator.add("0") shouldBe 0
                calculator.add("1") shouldBe 1
                calculator.add("10") shouldBe 10
                calculator.add("-12") shouldBe -12
            }
        }

        "2 numbers" - {
            "should return the sum of the numbers" {
                calculator.add("0,1") shouldBe 1
                calculator.add("1,1") shouldBe 2
                calculator.add("10,1") shouldBe 11
            }
        }
    }
})
