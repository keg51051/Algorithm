import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    var temp = 665
    var count = 0

    while (num > count) {
        temp++
        if (temp.toString().contains("666")) {
            count++
        }
    }

    print(temp)

    br.close()
    bw.close()
}