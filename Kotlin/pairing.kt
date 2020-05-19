fun main(args: Array<String>) {
    val N= readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val arr = Array(101) {0}
    for (i in A){
        arr[i]++
    }
    var ctr = 0
    for (i in A.toSet()){
        if(arr[i]/2 > 0) ctr+=arr[i]/2
    }
    println(ctr)
}