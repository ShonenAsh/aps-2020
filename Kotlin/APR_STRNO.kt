import java.util.ArrayList

fun main(args: Array<String>) {
    for (t in 1..readLine()!!.toInt()) {
        var (X, K) = readLine()!!.split(" ").map { it.toInt() }
        val pArr = ArrayList<Int>()
        while (X % 2 == 0) {
            pArr.add(2)
            X /= 2
        }
        var i = 3
        while (i * i <= X) {
            while (X % i == 0) {
                X /= i
                pArr.add(i)
            }
            i += 2
        }
        if (X > 2) pArr.add(X)
        if (pArr.size >= K) println(1) else println(0)
    }
}