import kotlin.math.pow

fun main(args: Array<String>) {
    val X = readLine()!!.toInt()
    val N = readLine()!!.toInt()
    println(rec(X, N, 1))
}

fun power(a: Int, b: Int) = a.toDouble().pow(b.toDouble()).toInt()

fun rec(X: Int, N: Int, k: Int): Int {
    return (
            if (power(k, N) < X)
                rec(X, N, k + 1) + rec(X - power(k, N), N, k + 1)
            else if (power(k, N) == X) 1
            else 0
            )
}