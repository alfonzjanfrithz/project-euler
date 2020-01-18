package com.alfonzjanfrithz.learn

import kotlin.math.pow

/**
 * The largest number by 2 digits is 99*99,
 * that would means, we just need to loop those numbers and find the palindrome.
 * I think we should iterate descending so that the number of iteration to get the palindrome is lesser.
 * Once it gets the largest product of two number, put it in a list to be checked for max value. That way we can get
 * The actual largest palindrome
 */
fun largestPalindromeProduct(numOfDigits: Int) : Int? {
    val maxNumberOfNDigits = (10.toDouble().pow(numOfDigits) - 1).toInt()
    val largestNum = mutableListOf<Int>()

    for (p in maxNumberOfNDigits downTo 0) {
        for(q in maxNumberOfNDigits downTo 0) {
            val result = p*q
            if(isPalindromeNumber(result)) {
                largestNum.add(result)
                continue
            }
        }
    }
    return largestNum.max()
}

fun isPalindromeNumber(num: Int) = num.toString() == num.toString().reversed()

