private fun kadane_2d(arr: Array<IntArray>) {
    val m = arr.size
    val n: Int = arr[0].size
    val sum_prev_arr = Array(m + 1) { IntArray(n) }
    for (i in 0 until m) {
        for (j in 0 until n) {
            sum_prev_arr[i + 1][j] = sum_prev_arr[i][j] + arr[i][j]
        }
    }
    var maxSum = -1
    var minSum = Int.MIN_VALUE
    var rStart = 0
    var rEnd = 0
    var cStart = 0
    var cEnd = 0
    var negRow = 0
    var negCol = 0
    for (rowStart in 0 until m) {
        for (row in rowStart until m) {
            var sum = 0
            var curColStart = 0
            for (col in 0 until n) {
                sum += sum_prev_arr[row + 1][col] - sum_prev_arr[rowStart][col]
                if (sum < 0) {
                    if (minSum < sum) {
                        minSum = sum
                        negRow = row
                        negCol = col
                    }
                    sum = 0
                    curColStart = col + 1
                } else if (maxSum < sum) {
                    maxSum = sum
                    rStart = rowStart
                    rEnd = row
                    cStart = curColStart
                    cEnd = col
                }
            }
        }
    }

    var finalSum = maxSum
    if (maxSum == -1) {
        rStart = negRow
        rEnd = negRow
        cStart = negCol
        cEnd = negCol
        finalSum = minSum
    }

    println(finalSum)
    for (i in rStart..rEnd)
        for (j in cStart..cEnd)
            if (arr[i][j] < 0) finalSum += -arr[i][j]
    println(finalSum)
}

fun main(args: Array<String>) {
    val NM = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val N = NM[0]
    val M = NM[1]

    val arr = Array(N) { i -> readLine()!!.split(" ").map { it.toInt() }.toIntArray() }

    kadane_2d(arr)
}