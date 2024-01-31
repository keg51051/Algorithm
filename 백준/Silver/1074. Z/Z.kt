import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var (N, r, c) = br.readLine().split(" ").map { it.toInt() }
    var answer = 0

    while (N != 0) {
        N -= 1

        val size = (2.0).pow(N).toInt()

        if (r < size && c < size) { // 1사분면
        } else if (size in (r + 1)..c) { // 2사분면
            answer += size * size
            c -= size
        } else if (size in c+1..r) { // 3사분면
            answer += size * size * 2
            r -= size
        } else { // 4사분면
            answer += size * size * 3
            r -= size
            c -= size
        }
    }
    print(answer)
}