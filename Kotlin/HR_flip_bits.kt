fun main(args: Array<String>){
    for (i in 1..readLine()!!.toInt()){
        val x :UInt = readLine()!!.toUInt()
        print("${x.inv()}\n")
    }
}