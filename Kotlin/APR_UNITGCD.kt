fun main(args: Array<String>) {
    for ( t in 1..readLine()!!.toInt()){
        val n = readLine()!!.toInt()
        if (n > 2) {
            println(n / 2)
            var i = 1
            while (i <= n/2 -1){
                println("2 "+(2*i -1)+ " "+ (i*2))
                i++
            }
            if (n % 2 == 0) println("2 ${n - 1} $n") else println("3 ${n - 2} ${n - 1} $n")
        } else {
            if (n==1) println("1\n1 1") else println("1\n2 1 2")
        }
    }
}