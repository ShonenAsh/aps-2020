fun cal(x: Long): Long {
    val a: Long = x % 8
    return when (a) {
        0L, 1L -> x
        2L, 3L -> 2
        4L, 5L -> x + 2
        else -> 0L
    }
}

fun main(args: Array<String>) {
    var q = readLine()!!.toInt()
    while (q-- != 0) {
        val (l, r) = readLine()!!.split(" ").map { it.toLong() }
        val res = cal(r) xor cal(l-1)
        print("$res\n")
    }
}