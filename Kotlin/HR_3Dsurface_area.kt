import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val HW = scan.nextLine().split(" ")

    val H = HW[0].trim().toInt()

    val W = HW[1].trim().toInt()

    val A = Array(H) { Array(W) { 0 } }

    for (i in 0 until H) {
        A[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    var area: Int = A.size * A[0].size * 2
    val temp =
        Array(A.size + 2) { IntArray(A[0].size + 2) }
    for (y in A.indices) {
        for (x in A[y].indices) {
            temp[y + 1][x + 1] = A[y][x]
        }
    }
    for (y in 1 until temp.size - 1) {
        for (x in 1 until temp[y].size - 1) {
            area += max(0, temp[y][x] - temp[y - 1][x])
            area += max(0, temp[y][x] - temp[y][x + 1])
            area += max(0, temp[y][x] - temp[y + 1][x])
            area += max(0, temp[y][x] - temp[y][x - 1])
        }
    }
    println(area)
}