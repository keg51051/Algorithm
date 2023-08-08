import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val arr = IntArray(10001)
    for (i in 0 until n) {
        arr[br.readLine().toInt()]++
    }
    for (i in arr.indices) {
        bw.write("$i\n".repeat(arr[i]))
    }

    br.close()
    bw.close()
}