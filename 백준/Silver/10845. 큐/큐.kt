import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val queue = ArrayDeque<Int>()
    val n = br.readLine().toInt()

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        when (st.nextToken()) {
            "push" -> queue.add(st.nextToken().toInt())
            "pop" -> if (queue.isNotEmpty()) bw.write(queue.removeFirst().toString() + "\n")
                        else bw.write("-1\n")
            "size" -> bw.write(queue.size.toString() + "\n")
            "empty" -> if (queue.isEmpty()) bw.write("1\n") else bw.write("0\n")
            "front" -> if (queue.isNotEmpty()) bw.write(queue.first().toString() + "\n")
                        else bw.write("-1\n")
            else -> if (queue.isNotEmpty()) bw.write(queue.last().toString() + "\n")
                        else bw.write("-1\n")
        }
    }

    br.close()
    bw.close()
}