package org.example.fizzbuzz

class FizzBuzz {
    companion object {
        fun fizzBuzz(number: Int): String =
            when {
                isThreeDivisible(number) && isFiveDivisible(number) -> "FizzBuzz"
                isThreeDivisible(number) -> "Fizz"
                isFiveDivisible(number) -> "Buzz"
                else -> number.toString()
            }

        private fun isFiveDivisible(number: Int) = number % 5 == 0
        private fun isThreeDivisible(number: Int) = number % 3 == 0
    }

}
