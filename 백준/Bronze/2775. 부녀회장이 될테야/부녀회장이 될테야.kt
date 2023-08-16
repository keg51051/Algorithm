import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val k = br.readLine().toInt()
        bw.write(condo(n,k).toString() + "\n")
    }

    br.close()
    bw.close()
}

fun condo(n: Int, k: Int): Int {
    if (n == 0) return k
    return if (k == 0) 0 else condo(n, k-1) + condo(n-1, k)
}