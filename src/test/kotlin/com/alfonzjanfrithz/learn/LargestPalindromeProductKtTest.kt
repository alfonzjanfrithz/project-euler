package com.alfonzjanfrithz.learn

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class LargestPalindromeProductKtTest {

    @DisplayName("Largest Palindrome Product")
    @ParameterizedTest(name = "Largest palindrome number from {0} digits of number is {1}")
    @CsvSource("2, 9009", "3, 906609")
    fun givenNumberOfDigitsCountLargestPalindromeNumber(numOfDigits: Int, expectedResult: Int) {
        Assertions.assertThat(largestPalindromeProduct(numOfDigits)).isEqualTo(expectedResult)
    }
}