import java.util.*

fun recursiveSum(numbers: java.util.ArrayList<Int>, sum: Int, partial: java.util.ArrayList<Int>) {
    var s = 0
    for (x in partial) s += x
    if ((s == sum) and (partial.size >= 2))
        println("sum(" + Arrays.toString(partial.toTypedArray()) + ")=" + sum)
    if (s >= sum)
        return
    for (i in numbers.indices) {
        val remaining = java.util.ArrayList<Int>()
        val n = numbers[i]
        for (j in i + 1 until numbers.size) remaining.add(numbers[j])
        val partial_rec = java.util.ArrayList(partial)
        partial_rec.add(n)
        recursiveSum(remaining, sum, partial_rec)
    }

    val x = 1234

    val x2 = x.toString().reversed().toInt()
}

fun calCount(numbers: java.util.ArrayList<Int>, target: Int) {
    recursiveSum(numbers, target, java.util.ArrayList())
}

fun x() {


}