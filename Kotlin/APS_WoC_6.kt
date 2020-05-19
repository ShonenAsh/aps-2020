//Shop-Sequence Count

fun main(args: Array<String>) {
    for (t in 0.until(readLine()!!.toInt())) {
        val N = readLine()!!.toInt()
        val inp = readLine()!!.split(" ").map { it.toLong() }.toLongArray()
        large_before_small(inp, inp.size)
    }
}

fun large_before_small(a: LongArray, n: Int) {
    var res = 0L
    val ctrArr = Array(n + 1) { 0L }
    val c = a.sorted().mapIndexed { index, x -> x to (index + 1) }.toMap()
    println(c)
    a.reversed().forEach {
        var i = c.getValue(it) - 1
        while (i > 0) {
            res += ctrArr[i]
            i -= i.and(-i)
        }

        i = c.getValue(it)

        while (i <= n) {
            ctrArr[i]++
            i += i.and(-i)
        }
    }
    println("$res\n${if (res >= n) "YES" else "NO"}")
}