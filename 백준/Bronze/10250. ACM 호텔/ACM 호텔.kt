import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val list = arrayListOf<List<Int>>()

    repeat(n) {
        list.add(br.readLine().split(" ").map { it.toInt() })
    }

    for (i in list) {
        if (i[2] % i[0] == 0) {
            bw.write((100 * i[0] + i[2] / i[0]).toString() + "\n")
        } else {
            bw.write((100 * (i[2] % i[0]) + (i[2] / i[0]) + 1).toString() + "\n")
        }
    }

    br.close()
    bw.close()
}