    import java.io.BufferedReader
    import java.io.InputStreamReader

    fun main() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val (a,b) = br.readLine()!!.split(' ')


        println(gcd(a.toInt(), b.toInt()))
        print(lcm(a.toInt(), b.toInt()))

    }
    
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) {
            a
        } else {
            gcd(b, a % b)
        }
    }

    fun lcm(a: Int, b: Int): Int {
        return a * b / gcd(a, b)
    }
