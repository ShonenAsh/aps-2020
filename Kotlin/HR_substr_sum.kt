fun main() {
    val mod = 1000000000L + 7
    val num = readLine()!!
    var sum: Long = 0
    var m: Long = 1
    for (i in num.length - 1 downTo 0) {
        sum += (num[i] - '0') * (i + 1) * m

        m = m * 10 + 1
    }
    println(sum % mod)
}