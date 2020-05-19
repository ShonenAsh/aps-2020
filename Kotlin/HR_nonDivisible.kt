import kotlin.math.max

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.trim().split(" ").map { it.toInt() }
    val arr = readLine()!!.split(" ").map { it.toInt() }
    val ctr_arr = IntArray(k) { 0 }
    for (i in arr)
        ctr_arr[i % k]++
    var ctr = if (ctr_arr[0] < 1) ctr_arr[0] else 1

    for (i in 1 until ((k / 2) + 1)) {
        if (i != k - i) ctr += max(ctr_arr[i], ctr_arr[k - i])
    }

    if (k % 2 == 0) ctr++
    print(ctr)
}