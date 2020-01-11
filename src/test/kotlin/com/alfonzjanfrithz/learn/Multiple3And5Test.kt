package com.alfonzjanfrithz.learn

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class Multiple3And5Test {
    @DisplayName("Should sum all the natural numbers below the param that are multiples of 3 or 5")
    @ParameterizedTest(name = "The sum of all numbers below ''{0}'' that are multiples of 3 or 5 should be ''{1}''")
    @CsvSource("10, 23", "1000, 233168", "49, 543", "19564, 89301183", "8456, 16687353")
    fun `should sum all the natural numbers below the param that are multiples of 3 or 5`(source: Int, result: Int) {
        Assertions.assertThat(multiplesOf3and5(source)).isEqualTo(result)
    }
}
