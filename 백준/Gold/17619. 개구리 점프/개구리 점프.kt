import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Comparator
import java.util.PriorityQueue

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (N, Q) = br.readLine().split(" ").map { it.toInt() }
    val parent = IntArray(N + 1) { it }
    val logs = Array(N) { List<Int>(3) {0} }

    fun find(x: Int): Int {
        if (parent[x] == x) return x
        parent[x] = find(parent[x])
        return parent[x]
    }

    fun union(x: Int, y: Int): Unit {
        val nx = find(x)
        val ny = find(y)
        if (nx == ny) return
        if (nx < ny) parent[ny] = nx else parent[nx] = ny
    }

    fun isCrossible(x1: Int, x2: Int, x3: Int, x4: Int): Boolean {
        val arr = IntArray(1001)
        for (i in x1..x2) {
            arr[i]++
        }
        for (i in x3..x4) {
            arr[i]++
        }

        return arr.contains(2)
    }



    for (i in logs.indices) {
        val log = br.readLine().split(" ").map { it.toInt() }
        logs[i] = log
    }

    for (i in logs.indices) {
        for (j in 1..<logs.size) {
            if (isCrossible(logs[i][0], logs[i][1], logs[j][0], logs[j][1])) {
                union(i+1, j+1)
            }
        }
    }

    repeat(Q) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        if (find(a) == find(b)) println(1) else println(0)
    }

    br.close()
}