fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }
    var temp = 0
    var max = 0
    A.toSet().forEach {
        temp = A.count { i -> i == it } + A.count { i -> i == it+1 }
        if (temp > max) max = temp
    }
    println(max)


}