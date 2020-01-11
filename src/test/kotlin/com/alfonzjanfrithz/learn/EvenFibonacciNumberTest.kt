package com.alfonzjanfrithz.learn

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class EvenFibonacciNumberTest {
    @Test
    fun shouldGenerateFibonacciNumber() {
        Assertions.assertThat(getFibonacciList(10)).isEqualTo(listOf(1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
    }

    @DisplayName("Should sum of all even number of fibonacci")
    @ParameterizedTest(name = "The sum of {0} fibonacci digits that are even is {1}")
    @CsvSource("10, 44", "18, 3382", "23, 60696", "43, 350704366")
    fun `should sum of all even number of fibonacci`(numOfFibonacci: Int, sum: Int) {
        Assertions.assertThat(sumOfEvenFibonnacciNumber(numOfFibonacci)).isEqualTo(sum)
    }
}