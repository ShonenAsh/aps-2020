import java.io.BufferedWriter
import java.io.FileWriter
import java.util.*

// Complete the superDigit function below.
fun superDigit(s: String, k: Int): Int {
    var n = s
    n = (n.chars().mapToLong { c: Int -> Character.getNumericValue(c).toLong() }
        .sum() * k).toString() + ""
    return if (n.length > 1) superDigit(n, 1) else Character.getNumericValue(n[0])
}

private val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {
    val bufferedWriter = BufferedWriter(FileWriter(System.getenv("OUTPUT_PATH")))
    val nk = scanner.nextLine().split(" ".toRegex()).toTypedArray()
    val n = nk[0]
    val k = nk[1].toInt()
    val result = superDigit(n, k)
    bufferedWriter.write(result.toString())
    bufferedWriter.newLine()
    bufferedWriter.close()
    scanner.close()
}
