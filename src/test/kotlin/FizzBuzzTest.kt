import org.example.fizzbuzz.FizzBuzz
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun 動くかな() {
        assertEquals(2, 2)
    }

    @Test
    fun 数字1を渡したら文字列の1を返す() {
        assertEquals("1", FizzBuzz.fizzBuzz(1))
    }
}