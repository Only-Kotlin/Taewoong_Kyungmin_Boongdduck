// 직각삼각형 https://www.acmicpc.net/problem/4153
// a,b,c의 max값을 구하는게 핵심

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    while (true) {
        val a = nextInt()
        val b = nextInt()
        val c = nextInt()

        val list = mutableListOf<Int>(a, b, c)
        val max = list.maxOf { it }
        if (a == 0 && b == 0 && c == 0)
            break

        if ((a*a)+(b*b)==max*max || (a*a)+(c*c)==max*max || (b*b)+(c*c)==max*max)
        println("right")
        else
        println("wrong")

    }
}
