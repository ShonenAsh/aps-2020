import kotlin.math.log

fun main() {
    val lookup = Array(50 + 1) { IntArray(50) }
    val arr = arrayOf(7, 2, 3, 0, 5, 10, 3, 12, 18)

    val n = 9

    for (i in 0.until(n)) {
        lookup[i][0] = i
    }
    var j = 1
    var i = 0
    while (1.shl(j) <= n) {
        while ((i + (1.shl(j) - 1)) < n) {
            if(lookup[i][j-1] < lookup[i + 1.shl(j-1)][j-1])
                lookup[i][j] = lookup[i][j-1]
            else
                lookup[i][j] = lookup[i + 1.shl(j-1)][j-1]
            i++
        }
        j++
    }

    fun query(arr:Array<Int>, L: Int, R: Int): Int {
        var j = log(2.0, (R-L+1).toDouble()).toInt()
        if (arr[lookup[L][j]] <= arr[lookup[R-(1.shl(j) +1)][j]])
            return arr[lookup[L][j]]
        else
            return arr[lookup[R - 1.shl(j) + 1][j]]
    }
}