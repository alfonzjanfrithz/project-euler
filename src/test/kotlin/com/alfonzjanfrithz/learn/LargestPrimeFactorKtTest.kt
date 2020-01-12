package com.alfonzjanfrithz.learn

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

class LargestPrimeFactorKtTest {
    @DisplayName("Should return The largest prime factor")
    @ParameterizedTest(name = "The largest prime factor of {0} is {1}")
    @CsvSource("2,2", "3,3", "7,7", "15, 5", "13195, 29", "392832, 31", "1787866, 893933", "600851475143, 6857")
    fun shouldReturnLargestPrimeDivisor(num: Long, largestPrimeFactor: Long) {
        assertThat(getLargestPrimeDivisor(num)).isEqualTo(largestPrimeFactor)
    }
}