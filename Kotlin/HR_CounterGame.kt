fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    while (t > 0) {
        val n = readLine()!!.toULong()
        if ((nSetBits(n - 1UL) and 1UL) != 0UL)
            print("Louise\n")
        else
            print("Richard\n")
    }
}

fun nSetBits(n: ULong): ULong {
    var x = n
    var ctr = 0UL
    while (x > 0UL){
        x = x and (x-1UL)
        ctr++
    }
    return ctr
}