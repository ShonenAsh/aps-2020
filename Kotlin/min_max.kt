import java.math.BigInteger

fun max_sum(arr: ArrayList<Long>) {
    var flag = false
    for (_x in 0..1) {
        var st = 0
        var s = 0
        var end = 0
        val n = arr.size

        var max_sum = (Long.MIN_VALUE).toBigInteger()
        var max_current = 0.toBigInteger()
        for (i in 0 until n) {
            if (!flag)
                if (arr[i] < 0)
                    flag = true

            max_current = max_current.plus(arr[i].toBigInteger())
            if (max_sum < max_current) {
                max_sum = max_current
                st = s
                end = i
            }
            if (max_current < 0.toBigInteger()) {
                max_current = 0.toBigInteger()
                s = i + 1
            }
        }
        if (!flag) {
            println("$max_sum\n0")
            return
        }
        println(max_sum)
        arr.subList(st, end + 1).clear()
    }
}

fun main(args: Array<String>) {

    var n = readLine()!!.toInt()
    val inp = ArrayList<Long>(readLine()!!.trim().split(" ").map { it.toLong() })
    max_sum(inp)
}