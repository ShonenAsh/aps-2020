fun getMoneySpent(k: IntArray, d: IntArray, b: Int): Int {
    var res = -1
    for (i in k.indices) {
        for (j in d.indices) {
            if (k[i] + d[j] in (res + 1)..b)
                res = k[i] + d[j]
        }
    }
    return res
}

fun main(args: Array<String>) {

    val (b, _, _) = readLine()!!.split(" ").map { it.toInt() }

    val k = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    val d = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    println(getMoneySpent(k, d, b))
}
