// https://www.acmicpc.net/problem/2231 
// 분해합

import java.util.*

fun main() = with(Scanner(System.`in`)) {


    val numberM = nextInt() // M
    var result = 0




    for (i in 0 until numberM) {
        var number = i
        var sum = 0
        // 각 자릿수 합 + i == numberM

        while (number != 0) {
            sum += number % 10
            number /= 10
        }

        if (sum + i == numberM) {
            result = i
            break
        }
    }
    print(result)
}

