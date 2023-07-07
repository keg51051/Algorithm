import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var num = br.readLine().toInt()
    val list = mutableListOf<Int>()

    repeat(num) {
        num = br.readLine().toInt()
        if (num == 0) {
            bw.write("1 0\n")
        } else if (num == 1) {
            bw.write("0 1\n")
        } else {
            bw.write("${fib(num-1)} ${fib(num)}\n")
        }
    }

    br.close()
    bw.close()
}

fun fib(n: Int): Int {
    val cache = IntArray(n+1)

    cache[0] = 0
    cache[1] = 1

    for (i in 2..n) {
        cache[i] = cache[i - 1] + cache[i - 2]
    }

    return cache[n]
}