package org.example.fizzbuzz

class FizzBuzz {
    companion object {
        fun fizzBuzz(number: Int): String =
            if (isThreeDivisible(number) && number % 5 == 0) {
                "FizzBuzz"
            } else if (isThreeDivisible(number)) {
                "Fizz"
            } else if (number % 5 == 0) {
                "Buzz"
            } else {
                number.toString()
            }

        private fun isThreeDivisible(number: Int) = number % 3 == 0
    }

}
