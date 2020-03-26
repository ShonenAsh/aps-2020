fun main(args: Array<String>) {
    val (n, k, q) = readLine()!!.split(" ").map { it.toInt() }

    val arr = readLine()!!.split(" ").map { it.toInt() }
    val st = k % n
    for (i in 1..q) {
        println(arr[((readLine()!!.toInt()) + n - st) % n])
    }

}