import java.io.BufferedReader
import java.io.InputStreamReader

var friends = arrayOf<IntArray>()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    friends = Array(n + 1) { IntArray(n + 1) { 100000 } }

    for (i in 1..n) {
        friends[i][i] = 0
    }

    while (true) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        if (a == -1 && b == -1) break

        friends[a][b] = 1
        friends[b][a] = 1
    }

    floyd(n)

    var min = Integer.MAX_VALUE
    val candidates = mutableListOf<Int>()

    for (i in 1..n) {
        var max = 0

        for (j in 1..n) {
            max = maxOf(max, friends[i][j])
        }

        if (max < min) {
            min = max
            candidates.clear()
            candidates.add(i)
        } else if (max == min) candidates.add(i)
    }

    println("$min ${candidates.size}")
    candidates.forEach { print("$it ") }

    br.close()
}

fun floyd(n: Int) {
    for (k in 1..n) {
        for (i in 1..n) {
            for (j in 1..n) {
                friends[i][j] = minOf(friends[i][j], friends[i][k] + friends[k][j])
            }
        }
    }
}