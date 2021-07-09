package com.example.myapplication.somewhat

// 주어진 테이블에서 후보키의 갯수를 구하는 문제 (복합키 포함)
fun main() {
    val data: Array<Array<String>> = arrayOf(
        arrayOf("100", "ryan", "music", "2"),
        arrayOf("200", "apeach", "math", "2"),
        arrayOf("300", "tube", "computer", "3"),
        arrayOf("400", "con", "computer", "4"),
        arrayOf("500", "muzi", "music", "3"),
        arrayOf("600", "apeach", "music", "2"),
    )

    println("result: ${solution(data)}")
}

fun solution(data: Array<Array<String>>): Int {
    var answer = 0
    val temp = ArrayList<String>()
    val keyIndex = ArrayList<Int>()

    for (i in data[0].indices) {
        for(student in data)
            if (temp.contains(student[i])) break else temp.add(student[i])

        if (temp.size == data.size) {
            keyIndex.add(i)
            answer++
        }

        temp.clear()
    }

    val arr1 = ArrayList<String>()
    val arr2 = ArrayList<String>()

    for (i in data[0].indices) {
        for (j in i until data[0].size) {
            if (i == j || keyIndex.contains(i)) continue
            print("[$i, $j]: ")

            for (student in data) {
                print("(${student[i]}, ${student[j]}), ")

                if (arr1.contains(student[i]) && arr2[arr1.indexOf(student[i])] == student[j]) {
                    print("break!")
                    break
                }
                else
                    arr1.add(student[i]).also { arr2.add(student[j]) }
            }
            println("\n${arr1.size}, ${data.size}")
            if (arr1.size == data.size)
                answer++

            arr1.clear()
            arr2.clear()

            println()
        }
    }

    return answer
}