import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var i = 1
    var sum = 1

    if (n == 1) {
        bw.write(1.toString())
    } else {
        while(true) {
            val six = 6 * i
            if (sum >= n) {
                bw.write(i.toString())
                break
            }
            sum += six
            i++
        }
    }

    br.close()
    bw.close()
}