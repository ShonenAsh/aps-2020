fun main(args: Array<String>) {
    for (t in 1 .. readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        val arr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        var res = 0
        if (n%2 != 0) {
            res = arr[0]
            for (i in 2 until n step 2) {
                res = res xor arr[i]
            }
        }
        print("$res\n")
    }
}
