fun main(args: Array<String>) {
    for (t in 1..readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        var prod = 1L
        val arr = readLine()!!.split(" ").map {
            prod *= it.toInt()
            it.toInt()
        }
        var ctr = 0
        if (prod % 4 != 2L) ctr++
        arr.reversed().forEach {
            prod /= it
            if (prod % 4 != 2L) ctr++
        }
        println(ctr)
    }
}