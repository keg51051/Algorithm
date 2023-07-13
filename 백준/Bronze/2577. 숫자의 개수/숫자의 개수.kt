import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val map = mutableMapOf<Int, Int>()
    for (i in 0..9) {
        map[i] = 0
    }
    val list = arrayListOf<Int>()
    repeat(3) {
        list.add(br.readLine().toInt())
    }
    val sum = list.reduce { a,b -> a * b }

    for (i in sum.toString()) {
        map[Character.getNumericValue(i)] = map[Character.getNumericValue(i)]!! + 1
    }

    map.values.forEach {
        bw.write(it.toString() + "\n")
    }

    br.close()
    bw.close()
}