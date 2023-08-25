import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val list = Array<Int>(12, {0})
    list[1] = 1
    list[2] = 2
    list[3] = 4

    repeat(n) {
        val num = br.readLine().toInt()
        if (num <= 3) {
            println(list[num])
        } else {
            for (i in 4..num) {
                list[i] = list[i-3] + list[i-2] + list[i-1]
            }
            println(list[num])
        }
    }

    br.close()
    bw.close()
}
