import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val memory = List(1) { 0 } + br.readLine().split(" ").map { it.toInt() }
    val result = IntArray(n)

    result[memory[1]] = 1

    for (i in 2..n) {
        for (j in result.indices) {
            if (result[j] == 0 && result.slice(0..<j).count { it == 0 } == memory[i]) {
                result[j] = i
                break
            }
        }
    }

    println(result.joinToString(" "))
}