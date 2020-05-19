import kotlin.math.pow

fun main(args: Array<String>) {
    var n = readLine()!!.toLong()

    var ctr = 0L
    while(n > 0){
        ctr += if (n%2 == 0L) 1 else 0
        n/=2;
    }
    ctr = 2.0.pow(ctr.toDouble()).toLong()
    print(ctr)
}