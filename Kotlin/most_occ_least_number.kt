fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val map = Array(6) { 0 }
    var max = 0
    var maxNum = 1
    readLine()!!.split(" ").map { it.toInt() }.forEach {
        map[it]++
        if (max < map[it]) {
            max = map[it]
            maxNum = it
        }
        else if (max == map[it] && it < maxNum) {
            max = map[it]
            maxNum = it
        }
    }
    println(maxNum)
}