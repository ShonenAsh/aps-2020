fun max_profit(arr: IntArray): Long {
    var curr_max = 0
    var p = 0L
    for (i in arr.reversed()) {
        if (i > curr_max)
            curr_max = i
        p += curr_max - i
    }
    return p
}


fun main(args: Array<String>) {
    for (i in 1..readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        val pr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        println(max_profit(pr))
    }
}