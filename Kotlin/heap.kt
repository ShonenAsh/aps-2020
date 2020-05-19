import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs


fun main(args: Array<String>) {
    val scan = BufferedReader(InputStreamReader(System.`in`))

    val N = scan.readLine().trim().toInt()
    val minHeap = PriorityQueue<Int>()
    val maxHeap = PriorityQueue(Comparator<Int> { o1: Int?, o2: Int? -> -Integer.compare(o1!!, o2!!) })
    for (q in 1..N) {
        val num = scan.readLine().toInt()
        minHeap.offer(num)
        maxHeap.offer(minHeap.poll())

        if(minHeap.size < maxHeap.size) {
            minHeap.offer(maxHeap.poll())
        }

        if(minHeap.size > maxHeap.size){
            println(minHeap.peek().toFloat())
        } else {
            println(minHeap.peek()+maxHeap.peek() / 2.0)
        }
    }
}