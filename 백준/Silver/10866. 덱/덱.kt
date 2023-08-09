import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val deque = ArrayDeque<Int>()
    val n = br.readLine().toInt()

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        when (st.nextToken()) {
            "push_front" -> deque.addFirst(st.nextToken().toInt())
            "push_back" -> deque.addLast(st.nextToken().toInt())
            "pop_front" -> if (deque.isNotEmpty()) bw.write(deque.removeFirst().toString() + "\n")
                            else bw.write("-1\n")
            "pop_back" -> if (deque.isNotEmpty()) bw.write(deque.removeLast().toString() + "\n")
                            else bw.write("-1\n")
            "empty" -> if (deque.isEmpty()) bw.write("1\n") else bw.write("0\n")
            "front" -> if (deque.isNotEmpty()) bw.write(deque.first().toString() + "\n") else bw.write("-1\n")
            "back" -> if (deque.isNotEmpty()) bw.write(deque.last().toString() + "\n") else bw.write("-1\n")
            else -> bw.write(deque.size.toString() + "\n")
        }
    }

    br.close()
    bw.close()
}