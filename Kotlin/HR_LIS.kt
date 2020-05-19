fun binarySearch(table: IntArray, a: Int, len: Int): Int {
    var h = len - 1
    var l = 0
    var mid = 0
    var res = -1
    while (l <= h) {
        mid = (h + l) / 2
        if (table[mid] < a) {
            l = mid + 1
            res = mid
        } else if (table[mid] == a) {
            return len - 1
        } else {
            h = mid - 1
        }
    }
    return res
}

fun main(args: Array<String>) {

    val size = readLine()!!.toInt()
    val arr = IntArray(size)
    val table = IntArray(size)
    for (i in 0 until size) {
        arr[i] = readLine()!!.toInt()
    }
    table[0] = arr[0]
    var len = 1
    for (i in 1 until size) {
        if (table[0] > arr[i]) {
            table[0] = arr[i]
        } else if (table[len - 1] < arr[i]) {
            table[len++] = arr[i]
        } else {
            table[binarySearch(table, arr[i], len) + 1] = arr[i]
        }
    }
    println(len)
}
