import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write((br.readLine()
        .split(" ")
        .map { it.toInt() * it.toInt() }
        .reduce { total,num -> total + num } % 10).toString())

    br.close()
    bw.close()
}