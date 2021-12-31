import java.util.*

/*
    별찍기 -2
    https://www.acmicpc.net/problem/2439
 */
fun main() = with(Scanner(System.`in`)) {

    val number = nextInt()
    for (i in 1 .. number) {
        for (j in number downTo 1) {
            if ( i<j) {
                print(" ")
            } else {
                print("*")
            }
        }
        println(" ")
    }
}
