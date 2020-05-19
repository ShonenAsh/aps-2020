fun main() {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val arr = readLine()!!.split(" ").map { it.toInt() }
    val tab = Array(N + 1) { 0 }
    tab[0] = 1
    arr.forEach {
        var j = it
        while (j <= N){
            tab[j] += tab[j-it]
            j++
        }
    }
    println(tab[N])
}