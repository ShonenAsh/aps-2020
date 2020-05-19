fun main(args: Array<String>) {
    for (t in 1..readLine()!!.toInt()) {
        var n: Long = readLine()!!.toLong()
        var p = 2L
        var max_p = 2L
        
        while(p*p <= n){
            while(n%p == 0L){
                max_p = p
                n /= p
            }
            p++
        }
        if (n>max_p)
            max_p = n

        print("$max_p\n")

    }
}