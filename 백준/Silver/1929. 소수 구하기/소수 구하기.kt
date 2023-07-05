import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val ab = br.readLine().split(" ").map { it.toInt() }
    if (ab[0] == 1) {
        for (i in 2..ab[1]) {
            if (isPrime(i)) bw.write(i.toString() + "\n")
        }
    } else {
        for (i in ab[0]..ab[1]) {
            if (isPrime(i)) bw.write(i.toString() + "\n")
        }
    }

    br.close()
    bw.close()
}

fun isPrime(n: Int): Boolean {
    var i = 2
    while (i*i <= n) {
        if (n % i++ == 0) return false
    }
    return true
}
