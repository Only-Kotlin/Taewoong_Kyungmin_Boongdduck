import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine()!!.toInt()
    val intList = IntArray(10001)
    for (i in 0 until input) {
        val nextInt = readLine()!!.toInt()
        intList[nextInt]++
    }
    close()
    for (i in intList.indices) {
        bw.write("$i\n".repeat(intList[i]))
    }
    bw.flush()
    bw.close()
}
