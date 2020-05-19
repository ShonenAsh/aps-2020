import java.util.*

inline fun IntRange.random() =
    Random().nextInt((endInclusive + 1) - start) + start
fun main(args: Array<String>) {
    for (t in 1..readLine()!!.toInt()) {
        val (N, M, K) = readLine()!!.split(" ").map { it.toInt() }
        for (i in 1..N){
            readLine()!!
        }
        for (i in 1..N){
            print("${(1..M).random()} ")
        }
    }
}