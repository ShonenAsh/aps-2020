fun main(args: Array<String>) {
//    val (x1, v1, x2, v2) = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
//    if (x1 - x2 != 0) {
//        if (v2 - v1 != 0) {
//            if ((x1 - x2) / (v2 - v1) > 0 && (x1 - x2) % (v2 - v1) == 0) {
//                println("YES")
//                return
//            }
//        }
//    }
//    println("NO")
    val inp: LongArray = readLine()!!.split(" ").map { it.toLong() }.toLongArray()
    inp.sort()
    println(inp.indexOf(element = 1))

}