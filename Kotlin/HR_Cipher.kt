fun cipher(k: Int, n: Int, s: String) {
    val arr = IntArray(n) {0}
    val res = IntArray(n)
    var i = 0
    while (i < n){
        arr[i] = s[i].toInt()%48
        if (i == 0)
            res[0] = arr[0]
        else if (i<k)
            res[i] = arr[i] xor arr[i - 1]
        else
            res[i] = (arr[i] xor arr[i - 1]) xor res[i - k]
        i++
    }
    print(res.joinToString(""))
}

fun main(args: Array<String>){
    val (n,k) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!
    cipher(k,n,s)
}