package org.example.fizzbuzz

class FizzBuzz {
    companion object {
        fun fizzBuzz(number: Int): String =
            when {
                number isDivisibleBy (3 to 5)  -> "FizzBuzz"
                number isDivisibleBy 3 -> "Fizz"
                number isDivisibleBy 5  -> "Buzz"
                else -> number.toString()
            }

        private infix fun Int.isDivisibleBy(divisor: Int) = this % divisor == 0
        private infix fun Int.isDivisibleBy(divisors: Pair<Int, Int>) = this % divisors.first == 0 && this % divisors.second == 0

    }

}
