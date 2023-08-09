import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val queue = ArrayDeque<Int>()

    for (i in 1..n) {
        queue.add(i)
    }

    while(queue.size != 1) {
        queue.removeFirst()
        queue.addLast(queue.first())
        queue.removeFirst()
    }

    bw.write(queue.first().toString())

    br.close()
    bw.close()
}