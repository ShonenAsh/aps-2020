fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var res = 0
    readLine()!!.split(" ").map { res = res xor it.toInt() }
    print("$res\n")
}
