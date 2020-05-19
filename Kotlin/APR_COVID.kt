fun main() {
    for (t in 1..readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        var ctr = 0
        var dis = 0
        var res = "YES"
        readLine()!!.split(" ").map { it.toInt() }.forEach {
            if (it == 1) {
                ctr++
            }
            if (ctr > 0) {
                if (it == 0) {
                    dis++
                } else {
                    if (dis < 5 && ctr > 1) {
                        res = "NO"
                        return@forEach
                    }
                    dis = 0
                }
            }
        }
        println(res)
    }
}