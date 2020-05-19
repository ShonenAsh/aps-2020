fun main(args: Array<String>) {
    for (t in 1..readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        var pf: Long = 0L
        val arr = readLine()!!.split(" ").map { it.toInt() }.sorted().reversed().toIntArray()
        for (i in 0 until n) {
            arr[i] = if (arr[i] >= i) arr[i] - i else 0
            pf += arr[i] % 1000000007L
        }
        println(pf)
    }
}