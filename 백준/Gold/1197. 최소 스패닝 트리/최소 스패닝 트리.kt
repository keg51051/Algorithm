import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Comparator
import java.util.PriorityQueue

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (V, E) = br.readLine().split(" ").map { it.toInt() }
    val parent = IntArray(V + 1) { it }
    val pq = PriorityQueue<List<Int>>(Comparator { a, b -> a[2] - b[2] })
    var answer = 0

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

    repeat(E) {
        val info = br.readLine().split(" ").map { it.toInt() }
        pq.offer(info)
    }

    while (pq.isNotEmpty()) {
        val temp = pq.poll()
        if (find(temp[0]) == find(temp[1])) continue
        union(temp[0], temp[1])
        answer += temp[2]
    }

    print(answer)

    br.close()
}