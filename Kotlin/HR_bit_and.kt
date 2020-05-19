import kotlin.math.log2

fun main(args: Array<String>){
    for (i in 1..readLine()!!.toInt()){
        val (a,b) = readLine()!!.split(" ").map { it.toUInt()}
        var res = a and b
        val l = log2((b-a).toDouble()).toInt() + 1
        res = (res shr l) shl l
        print("$res\n")
    }
}