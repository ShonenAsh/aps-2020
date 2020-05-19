import java.math.BigInteger

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var x = BigInteger.ONE!!
    for (i in n downTo 1){
        x *= i.toBigInteger()
    }
    println(x)
}