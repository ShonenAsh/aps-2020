fun main(args: Array<String>) {
    for (t in 1..readLine()!!.toInt()) {
        var sum = 1.toLong()
        val n = readLine()!!.toLong()
        var i = 2.toLong()
        while (i * i <= n) {
            if (n % i == 0L) {
                sum = if (i * i != n) sum + i + n / i else sum + i
            }
            i++
        }
        if(sum == n && n != 1L)
            println("YES")
        else
            println("NO")
    }
}