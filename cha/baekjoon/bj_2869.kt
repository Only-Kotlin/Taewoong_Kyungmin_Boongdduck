// 달팽이는 올라가고싶다. https://www.acmicpc.net/problem/2869
import java.util.*
import kotlin.math.ceil

fun main() = with(Scanner(System.`in`)) {

    val a = nextDouble() // 낮에 a
    val b = nextDouble() // 밤에 b
    val v = nextDouble() // 나무 높이

    val dday: Double = (v - b) / (a - b)

    println(ceil(dday).toInt())
}
