import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())
    val sb = StringBuilder()

    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt() - 1

    val list = (1..n).map { it }.toMutableList()

    sb.append("<")
    var idx = k
    while(list.size != 1) {
        sb.append("${list[idx]}, ")
        list.removeAt(idx)
        idx = (idx + k) % list.size
    }

    sb.append("${list.first()}>")
    bw.write(sb.toString())

    br.close()
    bw.close()
}