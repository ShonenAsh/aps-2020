import java.math.BigDecimal
import java.math.BigInteger
import kotlin.math.log2
import kotlin.math.pow

// TLE don't use

fun xorMatrix3(col: Int, row: Long, s: IntArray) {
    var current_row = s
    var i = 1L
    val next_row = IntArray(col)
    i = 2.0.pow(log2(row-1.0)).toLong()
   
    while (i < row) {

//        val next_row = IntArray(col)
        for (j in 0 until col) {
            if (j == col - 1) {
                next_row[j] = current_row[j] xor current_row[0]
            } else {
                next_row[j] = current_row[j] xor current_row[j + 1]
            }
        }
        current_row = next_row
        i++
    }
    print(current_row.joinToString(" "))
}

fun main(args: Array<String>){
    val (n,m) = readLine()!!.split(" ").map { it.toLong() }
    val s = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    xorMatrix3(n.toInt(), m, s)
}