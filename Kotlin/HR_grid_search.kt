fun main(args: Array<String>) {


    for (t in 1..readLine()!!.toInt()) {
        //grid
        val (R, C) = readLine()!!.split(" ").map { it.toInt() }
        val G = Array<String>(R) { readLine()!!.trim() }

        //pattern
        val (r, c) = readLine()!!.split(" ").map { it.toInt() }
        val P = Array<String>(r) { readLine()!!.trim() }
        var ctr = 0
        var ans = false
        for (k in 0..R - r) {
            var end = c
            var start = 0
            while (end <= C) {
                if (G.get(k).substring(start, end).equals(P[0])) {
                    for (i in 1 until r) {
                        if (G.get(k + i).substring(start, end).equals(P[i])) ctr++
                        if (ctr == r - 1) ans = true
                    }
                }
                ctr = 0
                end++
                start++
            }
        }
        if (ans) println("YES") else println("NO")

    }

}