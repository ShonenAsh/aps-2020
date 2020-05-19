fun main(args: Array<String>) {
    for (t in 1..readLine()!!.toInt()) {
        val n: Long = readLine()!!.toLong()
        var x: Long = 0
        var y: Long = 0
        var z: Long = 0
        x = (n - 1) / 3
        x = 3 * x * (x + 1) / 2
        y = (n - 1) / 5
        y = 5 * y * (y + 1) / 2
        z = (n - 1) / 15
        z = 15 * z * (z + 1) / 2
        println(x + y - z)
    }
}