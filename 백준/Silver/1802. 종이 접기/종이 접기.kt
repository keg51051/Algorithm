import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    repeat(br.readLine().toInt()) {
        val paper = br.readLine()

        fun fold(start: Int, end: Int): Boolean {
            if (start == end) {
                return true
            }
            val mid = (start + end) / 2

            for (i in start..<mid) {
                if (paper[i] == paper[end - i]) {
                    return false
                }
            }

            return fold(start, mid-1) && fold(mid+1, end)
        }

        if (fold(0, paper.length-1)) println("YES") else println("NO")
    }
}