fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val arr = readLine()!!.split(" ").map{ it.toInt() }.toMutableList()

    val S = arr.toSortedSet()

    S.forEach {
        println(arr.size)
        arr.removeAll { i -> i == it }
    }

}
