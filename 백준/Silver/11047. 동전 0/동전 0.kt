import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var (n, value) = br.readLine().split(" ").map { it.toInt() }

    val coins = IntArray(n) {br.readLine().toInt()}
    var numOfCoins = 0

    for (i in coins.reversed()) {
        val num = value / i
        value %= i
        numOfCoins += num
    }

    print(numOfCoins)

    br.close()
    bw.close()
}