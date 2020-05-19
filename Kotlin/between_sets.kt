fun main(args: Array<String>) {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val A = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val B = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    val x = lcm(A)
    val y = gcd(B)
    var ctr = 0
    var i = x
    var j = 2

    while (i <= y) {
        if (y % i == 0) {
            ctr++
        }
        i = x * j
        j++
    }
    println(ctr)
}

fun gcd(a1: Int, b1: Int): Int {
    var a = a1;
    var b = b1;
    while (b > 0) {
        val t = b
        b = a % b
        a = t
    }
    return a
}

fun gcd(arr: IntArray): Int {
    var res = arr[0]
    for (i in 1.until(arr.size)) {
        res = gcd(res, arr[i])
    }
    return res
}

fun lcm(a: Int, b: Int) = (a * (b / gcd(a, b)))

fun lcm(arr: IntArray): Int {
    var res = arr[0]
    for (i in 1.until(arr.size)) {
        res = lcm(res, arr[i])
    }
    return res
}