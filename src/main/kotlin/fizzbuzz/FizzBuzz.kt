package org.example.fizzbuzz

class FizzBuzz {
    companion object {
        fun fizzBuzz(number: Int): String =
            when {
                number % 3 == 0 && number % 5 == 0 -> "FizzBuzz"
                number % 3 == 0 -> "Fizz"
                number % 5 == 0 -> "Buzz"
                else -> number.toString()
            }

    }

}
