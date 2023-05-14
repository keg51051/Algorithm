import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val list = ArrayList<Int>(n)
    val nums = br.readLine().split(" ")
    for (i in 0 until n) {
        list.add(nums[i].toInt())
    }
    bw.write(list.min().toString() + " " + list.max().toString())
    bw.close()
}