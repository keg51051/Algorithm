import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in n/2 until n) {
        val sum = "$i".sumOf { it - '0' }
        if (n == (i + sum)) {
            print(i)
            return
        }
    }

    print(0)

    br.close()
    bw.close()
}