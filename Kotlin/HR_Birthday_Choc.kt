
// Complete the birthday function below.
fun birthday(s: IntArray, d: Int, m: Int): Int {
    val sum =  IntArray(105) {0}
    val n = s.size
    var ctr =0;
    for(i in 0.until(n)) sum[i+1]=sum[i]+s[i]

    for(i in 0..(n-m)){
        if(sum[i+m]-sum[i]==d){
            ctr++
        }
    }
    return ctr
}

fun main(args: Array<String>) {
    // nobody cares about n
    val n = readLine()

    val s = readLine()!!.split(" ").map{ it.toInt() }.toIntArray()

    val (d,m) = readLine()!!.split(" ").map{ it.toInt() }

    val result = birthday(s, d, m)

    println(result)
}