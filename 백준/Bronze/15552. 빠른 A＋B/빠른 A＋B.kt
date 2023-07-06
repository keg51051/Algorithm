import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var ab = listOf<Int>()
    val answer = arrayListOf<String>()

    repeat(n) {
        ab = br.readLine().split(" ").map { it.toInt() }
        answer.add((ab[0] + ab[1]).toString())
    }

    for (i in answer) {
        bw.write(i + "\n")
    }

    br.close()
    bw.close()
}

