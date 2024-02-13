import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    repeat(br.readLine().toInt()) {
        val candidates = mutableListOf<Pair<Int, Int>>()
        var answer = 0

        repeat(br.readLine().toInt()) {
            val (document, interview) = br.readLine().split(" ").map { it.toInt() }

            candidates.add(Pair(document, interview))
        }

        candidates.sortBy { it.first }

        var rank = Int.MAX_VALUE

        candidates.forEach {
            if (rank > it.second) {
                rank = it.second
                answer += 1
            }
        }

        println(answer)
    }
}