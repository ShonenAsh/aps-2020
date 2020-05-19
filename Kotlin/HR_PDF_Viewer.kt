fun main(args: Array<String>) {
    var (max, len) = arrayOf(-1, 0)
    val A = readLine()!!.split(" ").map { it.toInt() }
    readLine()!!.toCharArray().map {
        val x = A[it.toInt() - 97]
        if (max < x) max = x
        len += 1
    }
    println(max * len)
}
