/*
   https://programmers.co.kr/learn/courses/30/lessons/77484#fn1
   로또의 최고 순위와 최저 순위
 */

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {

        // 로또
        // 알수없는 번호 0
        // 44, 1, 0, 0, 31 25
        // 당첨 번호 31, 10, 45, 1 , 6, 19 라면
        // 최고 31, 1, 맞춤,맞춤
        // 최저 31, 1 , 아님,아님
        var zeroNumber = 0
        var containNumber = 0
        var resultList = mutableListOf<Int>()

        lottos.forEach {
            if(it==0)
                zeroNumber++
        }
        lottos.filter { it in win_nums }.apply {
            containNumber=this.size
        }

        // zeroNumber + containNumber == 최고점수
        // containNumber 최저점수.
        when(containNumber+zeroNumber){
            0->{resultList.add(0,6)}
            1->{resultList.add(0,6)}
            2->{resultList.add(0,5)}
            3->{resultList.add(0,4)}
            4->{resultList.add(0,3)}
            5->{resultList.add(0,2)}
            6->{resultList.add(0,1)}
        }
        when(containNumber){
            0->{resultList.add(1,6)}
            1->{resultList.add(1,6)}
            2->{resultList.add(1,5)}
            3->{resultList.add(1,4)}
            4->{resultList.add(1,3)}
            5->{resultList.add(1,2)}
            6->{resultList.add(1,1)}
        }

        return resultList.toIntArray()

    }
}
