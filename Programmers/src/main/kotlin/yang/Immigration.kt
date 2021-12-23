package yang

class Immigration {
    fun solution(n: Int, times: IntArray): Long {
        var min: Long = n.toLong() / times.size * times.minOf { it }.toLong()
        var max: Long = times.maxOf { it }.toLong() * n

        while (min <= max) {
            val mid = (min + max) / 2

            println("min: $min, max: $max, mid: $mid")

            // 현재 시간 안에 n명의 사람을 모두 심사할 수 있는지
            var sum: Long = 0
            times.forEach {
                sum += mid / it
                println("mid / it = ${mid / it}") // mid / it을 하면 주어진 시간(mid)에 it의 심사관이 몇 명을 심사할 수(sum) 있는지 알 수 있다.
            }

            println("sum = $sum") // 이를 모두 더하면(sum) 주어진 시간(mid) 안에 심사관들이 심사할 수 있는 사람의 수(sum)를 구할 수 있게 된다.

            // 모두 심사 가능한 경우
            if (sum >= n) max = mid - 1 // 더 짧은 시간으로 가능한지 확인

            // 모두 심사 가능하지 않은 경우
            else min = mid + 1 // 더 많은 시간 부여
        }

        return max + 1 //
    }


}

fun main() {
    print(Immigration().solution(6, intArrayOf(7, 10)))
}