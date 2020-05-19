fun main(args: Array<String>) {
    for(t in 1..readLine()!!.toInt()){
        var height = 0
        (0 .. readLine()!!.toInt()).forEach {
            if (it % 2 == 0) height++ else height *= 2
        }
        println(height)
    }
}