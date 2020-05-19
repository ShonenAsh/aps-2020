fun parity(x: Int): Int {
    var y = x xor (x shr 1)
    y = y xor (y shr 2)
    y = y xor (y shr 4)
    y = y xor (y shr 8)
    y = y xor (y shr 16)
    return y and 1
}

fun main(args: Array<String>) {
    for (t in 1..readLine()!!.toInt()) {
        var ctrE = 0
        var ctrO = 0
        val (N, Q) = readLine()!!.split(" ").map { it.toInt() }
        val A = readLine()!!.split(" ").map { it.toInt() }
        for(i in 1..Q){
            val P = readLine()!!.toInt()
            A.forEach {
                if(parity(it xor P) == 0)
                    ctrE++
                else
                    ctrO++
            }
            println("$ctrE $ctrO")
        }
    }
}