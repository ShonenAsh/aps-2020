import kotlin.math.*

// Returns the winner for Josephus problem where n is the number of participants
fun main() {
    val n = readLine()!!.toFloat()
    println((2 * (n - 2.0.pow(log2(n).toInt())) + 1).toInt())
}

