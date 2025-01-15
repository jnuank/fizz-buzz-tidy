import org.example.fizzbuzz.FizzBuzz
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun 数字1を渡したら文字列の1を返す() {
        assertEquals("1", FizzBuzz.fizzBuzz(1))
    }

    @Test
    fun 数字2を渡したら文字列の2を返す() {
        assertEquals("2", FizzBuzz.fizzBuzz(2))
    }

    @Nested
    inner class 数字3の倍数の場合はFizz() {
        @Test
        fun 数字3() {
            assertEquals("Fizz", FizzBuzz.fizzBuzz(3))
        }

        @Test
        fun 数字6() {
            assertEquals("Fizz", FizzBuzz.fizzBuzz(6))
        }

    }
}