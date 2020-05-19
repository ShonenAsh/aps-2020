import kotlin.math.max


fun maxSum(arr: IntArray) {

    var max_ending_here = 0
    var max_curr = Int.MIN_VALUE
    for (x in arr) {
        max_ending_here = max(x, max_ending_here + x)
        max_curr = max(max_curr, max_ending_here)
    }

    arr.sort()
    var sum = 0
    if (arr[arr.size - 1] <= 0)
        sum = arr[arr.size - 1]
    else {
        for (x in arr) {
            if (x > 0) sum += x
        }
    }
    print("$max_curr $sum\n")
}

fun main(args: Array<String>) {
    for(t in 1..readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        maxSum(readLine()!!.split(" ").map { it.toInt() }.toIntArray())
    }
}