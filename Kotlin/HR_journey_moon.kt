import java.util.*

fun main(args: Array<String>) {
    val (N,P) = readLine()!!.split(" ").map{it.toInt()}
    val g = Graph1(N)
    for (i in 0 until P) {
        val read =  readLine()!!.split(" ").map{it.toInt()}
        g.addEdge(read[0], read[1])
    }
    println(g.solve())
}

internal class Graph1(var V: Int) {
    var graph: HashMap<Int, ArrayList<Int>> = HashMap()
    var visited: BooleanArray = BooleanArray(V)
    fun addEdge(s: Int, d: Int) {
        graph[s]!!.add(d)
        graph[d]!!.add(s)
    }

    fun DFS(s: Int): Int {
        var count = 1
        visited[s] = true
        for (i in graph[s]!!) {
            if (!visited[i]) {
                count += DFS(i)
            }
        }
        return count
    }

    fun traversal(): ArrayList<Int> {
        val countrySizes = ArrayList<Int>()
        for (i in visited.indices) {
            if (!visited[i]) countrySizes.add(DFS(i))
        }
        return countrySizes
    }

    fun solve(): Long {
        val countrySizes = traversal()
        var sum: Long = 0
        var result: Long = 0
        for (size in countrySizes) {
            result += sum * size
            sum += size.toLong()
        }
        return result
    }

    init {
        for (i in 0 until V) {
            graph[i] = ArrayList()
        }
    }
}