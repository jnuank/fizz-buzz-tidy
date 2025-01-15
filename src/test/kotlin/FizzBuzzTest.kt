import org.example.fizzbuzz.FizzBuzz
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

    @Test
    fun 数字3を渡したら文字列のFizzを返す() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3))
    }
}