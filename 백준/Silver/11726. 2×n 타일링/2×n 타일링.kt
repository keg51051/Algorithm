import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val answer = IntArray(1001) { 1 }

    for (i in 2..n) {
        answer[i] = (answer[i-1] + answer[i-2]) % 10007
    }

    print(answer[n])

    br.close()
}