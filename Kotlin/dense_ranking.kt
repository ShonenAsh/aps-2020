import java.util.*
import kotlin.collections.ArrayList

//Shop-Sequence Count

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val LB = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val M = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    rankit(LB, A)
}

// TODO
fun rankit(L: IntArray, A: IntArray) {
    var Rank = ArrayList<Int>(A.size+1)
}

