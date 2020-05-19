fun main(args: Array<String>) {
    val x = readLine()!!.toInt() xor readLine()!!.toInt()
    // the most sig bit set to 1
    val sBit = 31 - Integer.numberOfLeadingZeros(x)
    val ans = (1 shl sBit + 1) - 1
    println(ans)
}