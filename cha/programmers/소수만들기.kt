class Solution {
    fun solution(nums: IntArray): Int {

        var answer = 0

        for (i in 0 until nums.size - 2) {
            for (j in i+1 until nums.size - 1) {
                for (k in j+1 until nums.size) {
                    val sum = nums[i] + nums[j] + nums[k]
                    var check = 0


                    // 에라토스테네츠의 체
                    for (i in 2 until sum) {
                        if (sum % i == 0){  // 짝수
                            check=1
                            break
                        }
                    }
                    if (check==0) { // 홀수
                        answer+=1
                    }
                }
            }
        }
        return answer
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution(intArrayOf(1, 2, 3, 4)))
}
