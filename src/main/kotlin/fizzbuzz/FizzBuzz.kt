package org.example.fizzbuzz

class FizzBuzz {
    companion object {
        fun fizzBuzz(number: Int): String =
            if (is3(number) && number % 5 == 0) {
                "FizzBuzz"
            } else if (is3(number)) {
                "Fizz"
            } else if (number % 5 == 0) {
                "Buzz"
            } else {
                number.toString()
            }

        private fun is3(number: Int) = number % 3 == 0
    }

}
