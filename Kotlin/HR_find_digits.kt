fun main(args: Array<String>) {
    for (t in 1..readLine()!!.toInt()) {
        var d = 0
        val n = readLine()!!.toInt()
        var t = n
        while (t != 0) {
            val i = t % 10
            if (n % i == 0) d++
            t/= 10
        }
        println(d)
    }


}