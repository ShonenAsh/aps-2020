import java.util.*

fun main(args: Array<String>) {
    for (t in 1..readLine()!!.toInt()) {
        val s = readLine()!!
        var a = ""
        var f = 0 //flag
        var x = 0
        var chars: Int = 1
        while (chars <= s.length) {
            a = s.substring(s.length - chars)
            x = a.length - 1
            while (x > 0) {
                if (a[0] < a[x]) {
                    f = 1
                    break
                }
                if (f == 1) break
                x--
            }
            if (f == 1) break
            chars++
        }
        if (f == 1) {
            var temp = a.substring(0, x) + a.substring(x + 1)
            val ch = temp.toCharArray().sortedArray()
            temp = a[x].toString() + String(ch)
            val ans = s.substring(0, s.length - chars) + temp
            print("$ans\n")
        } else println("no answer")
    }
}