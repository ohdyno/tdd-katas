package com.ford.labs.tdd.katas.calculator

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec


class CalculatorTests : StringSpec({
    val calculator = Calculator()

    "Given empty, returns 0" {
        calculator.add("") shouldBe 0
    }

    "Given 0, returns 0" {
        calculator.add("0") shouldBe 0
    }

    "Given 1, return 1" {
        calculator.add("1") shouldBe 1
    }

    "Given 0,1 return 1" {
        calculator.add("0,1") shouldBe 1
    }

    "Given 1,1 return 2" {
        calculator.add("1,1") shouldBe 2
    }

    "Given 10,1 return 11" {
        calculator.add("10,1") shouldBe 11
    }
})
