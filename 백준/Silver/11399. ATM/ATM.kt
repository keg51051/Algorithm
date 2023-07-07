import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    val line = br.readLine().split(" ").map { it.toInt() }.sorted()
    var answer = line[0]

    for (i in 1 until num) {
        answer += line.take(i+1).reduce { total, num -> total + num }
    }

    bw.write(answer.toString())

    br.close()
    bw.close()
}