fun joshephus(n: Int, k: Int): Int {
    return if (n == 1)
        1
    else
        (joshephus(n - 1, k) + k - 1) % n + 1
}

fun main() {
    /**
     * Input Format: (space separated)
     * n k
     * n = number of participants for Josephus problem
     * k = every kth person is eliminated
     */
    val (n, k) = readLine()!!.split(" ").map{it.toInt()}
    println(joshephus(n, k))
}