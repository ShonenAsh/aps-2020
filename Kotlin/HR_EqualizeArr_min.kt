fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    print(minDelEqual(arr.toIntArray()))
}

fun minDelEqual(a: IntArray): Int {
    var max = 1
    val n_map = mutableMapOf<Int, Int>()
    for (i in a) if (!n_map.containsKey(i)) n_map[i] = 1 else {
        n_map[i] = n_map[i]!! + 1
        if (max < n_map[i]!!) max = n_map[i]!!
    }
    return a.size - max
}