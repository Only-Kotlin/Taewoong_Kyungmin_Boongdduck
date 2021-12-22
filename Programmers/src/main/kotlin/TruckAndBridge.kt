import java.util.*

class TruckAndBridge {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var truckList = truck_weights
        val bridgeQueue: Queue<Int> = LinkedList()
        val timer = arrayListOf<Int>()
        val passedTrucks = arrayListOf<Int>()

        var totalTime = 0 // 총 소요 시간

        var truckIndex = 0 // 다음으로 출발할 트럭의 인덱스


        while (true) {
            println("$totalTime, $passedTrucks, $bridgeQueue, ${truckList.contentToString()}\t\t\t$timer")

            if (truckIndex >= truckList.size)
                if (bridgeQueue.isEmpty())
                    break

            for (i in 0 until timer.size) {
                if (--timer[i] <= 0) { // 남은 시간이 0이 되면
//                        timer.removeFirst() // 타이머 큐에서 트럭 제거
                    passedTrucks.add(bridgeQueue.poll()) // 통과한 트럭 리스트에 추가
                }
            }

            if ((weight - bridgeQueue.sum()) >= truckList[truckIndex] && bridgeQueue.size < bridge_length) { // 다리 위에 트럭이 올라갈 수 있는 상황이면
                bridgeQueue.add(truckList[truckIndex]) // 트럭을 추가
                timer.add(bridge_length) // 타이머 큐에 추가
                truckList = truckList.drop(1).toIntArray() // 대기중인 트럭 리스트에서 제거

            }

            totalTime++
            Thread.sleep(500)
        }

        return totalTime
    }
}

fun main() {
    val bridgeLength = 2
    val weight = 10
    val truckList = intArrayOf(7, 4, 5, 6)

    print(TruckAndBridge().solution(bridgeLength, weight, truckList))
}