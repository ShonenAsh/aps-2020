fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val arr = readLine()!!
    var h = 0
    var valleys = 0
    for (i in 0.until(arr.length)) {
        if (arr[i] == 'D') h-- else h++
        if (i > 0 && arr[i] == 'U' && h == 0){
            valleys++
        }
    }
    println(valleys)
}