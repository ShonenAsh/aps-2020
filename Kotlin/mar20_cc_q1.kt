fun main(args: Array<String>) {
    for (t in 0.until(readLine()!!.toInt())) {
        fun readStr() = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

        val (N, M) = readStr()
        val inp = readStr()
        val price = readStr()

        // val map = Array(M+1) {-1}
        val map = mutableMapOf<Int,Int>()

        for (i in 0.until(N)){
            if(map.containsKey(inp[i]))
                map[inp[i]] = map[inp[i]]!! + price[i]
            else
                map[inp[i]] = price[i]
        }
        println(map.values.min())
    }
}
