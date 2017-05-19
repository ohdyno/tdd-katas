package com.ford.labs.tdd.katas.greeter

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

class GreeterTests : StringSpec() {
    init {
        "Greeter should be able to say hello" {
            Greeter("Labs").greet() shouldBe "Hello Labs!"
            Greeter("World").greet() shouldBe "Hello World!"
        }
    }
}