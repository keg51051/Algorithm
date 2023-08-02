import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val arr = arrayListOf<Pair<Int, String>>()

    for (i in 0 until n) {
        val (age, name) = br.readLine().split(" ")
        arr.add(Pair(age.toInt(), name))
    }

    arr.sortBy { it.first }

    for (i in arr) {
        println(i.first.toString() + " " + i.second)
    }

    br.close()
}