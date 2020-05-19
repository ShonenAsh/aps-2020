fun knapsack(arr: IntArray, sum: Int): Int {
    if (arr.isEmpty() || sum == 0)
        return 0
    if (sum < arr.min()!!)
        return 0
    for (i in arr) {
        if (sum % i == 0)
            return sum
    }

    val tab = IntArray(sum + 1) { 0 }
    var current_max = 0
    for (i in 1 until sum + 1) {
        for (x in arr) {
            if ((i - x == 0) || (i - x > 0) && tab[i - x] == 1) {
                tab[i] = 1
                current_max = i
            }
        }
    }
    return current_max
}

fun main(args: Array<String>) {
    for (i in 1..readLine()!!.toInt()) {
        val (N, K) = readLine()!!.split(" ").map { it.toInt() }
        val arr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        println(knapsack(arr, K))
    }
}