// BJ 1085 
// 직사각형에서 탈출 https://www.acmicpc.net/problem/1085

import java.util.*

fun main() = with(Scanner(System.`in`)) {


    val x = nextInt()
    val y = nextInt()
    val w = nextInt()
    val h = nextInt()

    print(mutableListOf<Int>(w - x, h - y, x - 0, y - 0).minOf { it })
}
