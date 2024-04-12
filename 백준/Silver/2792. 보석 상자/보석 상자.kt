import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val gem = IntArray(m)

    repeat(m) {
        gem[it] = br.readLine().toInt()
    }

    var low = 1
    var high = gem.max()

    while (low <= high) {
        val mid = (low + high) / 2
        var gemCnt = 0

        repeat(m) {
            val temp = gem[it] / mid

            gemCnt += if (gem[it] % mid != 0) {
                temp + 1
            } else {
                temp
            }
        }

        if (gemCnt <= n) {
            high = mid - 1
        } else {
            low = mid + 1
        }
    }

    print(low)
}