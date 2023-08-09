import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val set = br.readLine().split(" ").map { it.toInt() }.sorted()
    val m = br.readLine().toInt()
    val nums = StringTokenizer(br.readLine())

    repeat(m) {
        val temp = set.binarySearch(nums.nextToken().toInt())
        if (temp < 0) bw.write("0\n") else bw.write("1\n")
    }
    
    br.close()
    bw.close()
}