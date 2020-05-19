fun binaryEquivalent(s: String): Int {

    val bits = CharArray(10) {'0'}
    for (c in s) {
        bits[c.toInt() - 48] = '1'
    }
    return bits.joinToString(separator = "").toInt(2)
}

fun main(args: Array<String>) {
    val freq = LongArray(1024)
    var binary: Int
    val size = readLine()!!.toInt()
    var ctr = 0L
    for (i in 0 until size) {
        val ticketsItem = readLine()!!.trim()
        binary = binaryEquivalent(ticketsItem)
        freq[binary] += 1L
    }
    //    print(binaryEquivalent("129300455").toString())

    for (i in 0..1022) {
        if (freq[i] == 0L) continue
        for (j in i + 1..1023) {
            if (i or j == 1023) ctr += freq[i] * freq[j]
        }
    }
    ctr += freq[1023] * (freq[1023] - 1) / 2
    println(ctr)

}
