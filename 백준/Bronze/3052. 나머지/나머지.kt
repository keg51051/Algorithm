import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val nums = arrayListOf<Int>()
    val set = mutableSetOf<Int>()

    repeat(10) {
        nums.add(br.readLine().toInt())
    }

    nums.forEach {
        set.add(it % 42)
    }

    bw.write(set.size.toString())

    br.close()
    bw.close()
}