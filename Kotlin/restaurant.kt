import java.io.*


// Complete the bonAppetit function below.
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    var sumby2 = bill.sum()/2
    sumby2 -= bill[k]/2
    sumby2 -= b
    print(when(sumby2) {
        0 -> "Bon Appetit"
        else -> sumby2
    })
}

fun main(args: Array<String>) {
    val inp = BufferedReader(InputStreamReader(System.`in`))
    val nk = inp.readLine().trim().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = inp.readLine().trim().split(" ").map{ it.toInt() }.toTypedArray()

    val b = inp.readLine().toInt()

    bonAppetit(bill, k, b)
}
