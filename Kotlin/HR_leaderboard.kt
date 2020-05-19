fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val scores = readLine()!!.split(" ").map { it.toInt() }
    val M = readLine()!!.toInt()
    val al = readLine()!!.split(" ").map { it.toInt() }

    val res = leaderB(scores.toIntArray(), al.toIntArray())
    res.forEach { print("" + it +"\n") }
}

fun leaderB(scores: IntArray, al_arr: IntArray): IntArray {
    val map = mutableMapOf<Int,Int>()
    val res_arr = IntArray(al_arr.size)
    val n = scores.size
    var k = 0
    var d = 0
    for (i in (al_arr.size-1) downTo 0){
        while ((k<n) && al_arr[i] < scores[k] ){
            if (map.containsKey(scores[k]) && map[scores[k]]!! > 0)
                d++
            map[scores[k]] = scores[k]++
            k++
        }
        res_arr[i] = k - d + 1
    }
    return res_arr
}