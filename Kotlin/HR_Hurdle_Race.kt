fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val A = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    var max = 0
    A.forEachIndexed { idx, i ->
        if(A[idx] - K > 0) A[idx] = i - K else A[idx] = 0
        if (max < A[idx]) max = A[idx]
    }
    println(max)
}
