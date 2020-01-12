package com.alfonzjanfrithz.learn

/*
Problem 3: Largest prime factor
The prime factors of 13195 are 5, 7, 13 and 29.
 */

/**
 * What didnt work before:
 * i tried to get all the prime numbers from 0 until specified number in parameter.
 * Once that generated try to divide the number with the largest prime number.
 * This was a problem when we try to get very huge number e.g 60bil,
 * to reach 1 billion loop (without doing anything) it took 3 second, to get 60bil,
 * it may take 180 secs. Which doesnt make sense.
 *
 * What works better, try to do it using the elementary school way as follows.
 * We start from the lower bound of the prime number which is (2) and we keep incrementing
 * the divisor, until it becomes divisible.
 *
 * The loop stop when divisor is as high as the current highes divison
 *
 *   18
 *  /  \
 * 2    9
 *    /   \
 *   3    3
 */
fun getLargestPrimeDivisor(num: Long): Long {
    var divisor = 2
    var currentHighestDivison = num
    while (divisor < currentHighestDivison) {
        if (currentHighestDivison % divisor == 0L) {
            currentHighestDivison /= divisor
            continue
        } else {
            divisor++
        }
    }

    return currentHighestDivison
}