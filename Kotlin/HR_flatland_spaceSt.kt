import kotlin.math.abs


fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val c = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val a = IntArray(n) { Int.MAX_VALUE }
    for (i in 0 until m) {
        for (j in 0 until n) {
            if (j == c[i]) a[j] = 0 else if (a[j] > abs(j - c[i])) a[j] = abs(j - c[i])
        }
    }
    a.sort()
    println(a[n - 1])
}

