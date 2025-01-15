package org.example.fizzbuzz

class FizzBuzz {
    companion object {
        fun fizzBuzz(number: Int): String {
            if (number % 3 == 0) {
                return "Fizz"
            }
            return number.toString()
        }
    }

}
