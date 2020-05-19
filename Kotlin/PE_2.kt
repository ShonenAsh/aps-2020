fun main(args: Array<String>) {
    for (t in 1..readLine()!!.toInt()) {
        val n: Long = readLine()!!.toLong()
        var x1: Long = 0
        var x2: Long = 1
        var sum: Long = 0
        var evenSum: Long = 0
        while (x2 <= n) {
            sum = x1 + x2
            x1 = x2
            x2 = sum
            if (sum % 2 == 0L && sum < n)
                evenSum += sum
        }
        println(evenSum)
    }
}

