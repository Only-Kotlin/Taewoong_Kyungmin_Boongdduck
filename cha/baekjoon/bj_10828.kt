import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stack = Stack<Int>()
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    repeat(readLine().toInt()) {
        val line = readLine().split(" ")

        when (line[0]) {
            "top" -> bw.write(("${if (stack.empty()) -1 else stack.peek()}\n"))
            "empty" -> bw.write(("${if (stack.empty()) 1 else 0}\n"))
            "pop" -> bw.write(("${if (stack.empty()) -1 else stack.pop()}\n"))
            "size" -> bw.write(("${stack.size}\n"))
            "push" -> stack.push(line[1].toInt())
        }


    }
    bw.flush()
}




