import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    val list = ArrayList<Pair<Int, Int>>()

    repeat(t) {
        val (w, h) = br.readLine().split(" ").map { it.toInt() }
        list.add(Pair(w,h))
    }

    for (i in list) {
        var rank = 1
        for (j in list) {
            if (i.first < j.first && i.second < j.second) rank++
        }
        print("$rank ")
    }

    br.close()
    bw.close()
}