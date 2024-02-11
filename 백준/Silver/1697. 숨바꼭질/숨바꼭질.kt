import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n, k) = br.readLine().split(" ").map { it.toInt() }

    print(shortest(n, k))
}

fun shortest(n: Int, k: Int): Int {
    val visited = IntArray(100001) { 0 }
    val q = ArrayDeque<Int>()

    q.add(n)

    while (q.isNotEmpty()) {
        val temp = q.removeFirst()
        if (temp == k) return visited[temp]

        repeat(3) {
            val next = when (it) {
                0 -> temp - 1
                1 -> temp + 1
                else -> temp * 2
            }

            if (next in 0..100000 && visited[next] == 0) {
                q.add(next)
                visited[next] = visited[temp] + 1
            }
        }
    }

    return 0
}