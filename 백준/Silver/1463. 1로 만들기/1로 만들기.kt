import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    BufferedReader(InputStreamReader(System.`in`)).use {
        val input = readlnOrNull()?.toInt()
        var x = IntArray(input!!.plus(1))
        for (i in 2..input) {
            x[i] = x[i - 1] + 1
            if (i % 2 == 0) x[i] = min(x[i], x[i / 2] + 1)
            if (i % 3 == 0) x[i] = min(x[i], x[i / 3] + 1)
        }
        print(x[input])
    }
}