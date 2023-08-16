import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val list = ArrayList<Pair<Int, Int>>()
    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        list.add(Pair(x,y))
    }

    list.sortWith(compareBy({ it.second }, { it.first }))

    list.forEach {
        bw.write("${it.first} ${it.second}\n")
    }

    br.close()
    bw.close()
}