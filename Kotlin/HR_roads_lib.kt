import java.util.*

fun main(args: Array<String>) {
    for (t in 0 until  readLine()!!.toInt()) {
        val (n, m, clib, croad) = readLine()!!.split(" ").map { it.toLong() }
        val g = Graph(n.toInt(), false)
        for (a1 in 0 until m.toInt()) {
            val (c1, c2) = readLine()!!.split(" ").map { it.toInt() }
            g.insertEdge(c1 - 1, c2 - 1)
        }
        println(getCost(g, clib, croad))
    }
}

private fun getCost(g: Graph, clib: Long, croad: Long): Long {
    if (clib < croad) {
        return (clib * g.v).toLong()
    }
    val visited = BooleanArray(g.v)
    var cost: Long = 0
    for (i in 0 until g.v) {
        if (!visited[i]) {
            val x = DFSUtil(g, visited, i)
            cost += (x - 1) * croad.toLong()
            cost += clib.toLong()
        }
    }
    return cost
}

private fun DFSUtil(g: Graph, visited: BooleanArray, current: Int): Int {
    var count = 1
    visited[current] = true
    for (a in g.list[current]) {
        if (!visited[a]) {
            count += DFSUtil(g, visited, a)
        }
    }
    return count
}

internal class Graph(val v: Int, private val directed: Boolean) {
    var list: Array<LinkedList<Int>> = Array<LinkedList<Int>>(v) { LinkedList<Int>() }
    fun insertEdge(a: Int, b: Int) {
        list[a].add(b)
        if (!directed) {
            list[b].add(a)
        }
    }
}