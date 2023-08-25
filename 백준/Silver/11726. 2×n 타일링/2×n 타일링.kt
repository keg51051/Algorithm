import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val answers = Array<Int>(1001, {0})

    answers[1] = 1
    answers[2] = 2

    for (i in 3..n) {
        answers[i] = (answers[i-1] + answers[i-2]) % 10007
    }

    print(answers[n])

    br.close()
    bw.close()
}