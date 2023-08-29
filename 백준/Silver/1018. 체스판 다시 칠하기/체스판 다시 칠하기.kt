import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val fullBoard = List<String>(n) { br.readLine() }

    var answer = 64

    if (n != 8 || m != 8) {
        for (i in 0 .. n-8) {
            for (j in 0 .. m-8) {
                var temp = listOf<String>()
                for (k in i until (i + 8)) {
                    temp += (fullBoard[k].substring(j, j+8))
                }
                answer = answer.coerceAtMost(numOfChanges(temp.joinToString("")))
            }
        }
        print(answer)
    } else {
        print(numOfChanges(fullBoard.joinToString("")))
    }

    br.close()
}

fun numOfChanges(b: String): Int {
    val startW = 
    "WBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBW"
    val startB =
    "BWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWB"
    return b.zip(startW).count { it.first != it.second }
            .coerceAtMost(b.zip(startB).count { it.first != it.second })
}