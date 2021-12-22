class GymClothes {
    /**
    전체 학생의 수 n,
    체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
    여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수
     */

    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {

        val lostList = lost.sorted().toMutableList()
        val reserveList = reserve.sorted().toMutableList()


        reserve.filter {
            lostList.contains(it)
        }.forEach {
            lostList.remove(it)
            reserveList.remove(it)
        }

        reserveList.forEach {
            when {
                lostList.contains(it - 1) -> lostList.remove(it - 1)
                lostList.contains(it + 1) -> lostList.remove(it + 1)
            }
        }
        return n - lostList.size
    }
}

fun main() {

    print(GymClothes().solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5)))
}