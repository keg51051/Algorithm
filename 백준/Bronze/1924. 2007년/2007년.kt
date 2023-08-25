import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val days = arrayListOf<Int>(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val dow = arrayListOf<String>("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    var total = 0

    val (m, d) = br.readLine().split(" ").map { it.toInt() }

    for (i in 0 until m-1) {
        total += days[i]
    }

    total += d

    bw.write(dow[total % 7].toString())

    br.close()
    bw.close()
}
