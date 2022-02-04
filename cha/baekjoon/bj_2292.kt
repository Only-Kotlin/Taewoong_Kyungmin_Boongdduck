// https://www.acmicpc.net/problem/2292
import java.util.*
fun main()=with(Scanner(System.`in`)){
    val N=nextInt()
    
    var a=1 //벌집 갯수
    var b= 2
    
    while(b<=N){ // N이 13면
       b=b+(a*6)
        a++
        
    }
    print(a)
    
}
