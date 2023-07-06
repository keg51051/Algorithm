import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }
    var answer = 0

    for (i in list) {
        if (i == n) {
            answer++
        }
    }

    bw.write(answer.toString())


    br.close()
    bw.close()
}