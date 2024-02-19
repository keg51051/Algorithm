import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val worm = IntArray(21) { 1 }

    worm[2] = 2
    worm[3] = 4
    worm[4] = 7

    for (i in 4..<n) {
        worm[i+1] = worm[i] * 2

        if ((i+1-3) % 2 == 1) worm[i+1] -= worm[i-3]
        if ((i+1-4) % 2 == 0) worm[i+1] -= worm[i-4]
    }

    print(worm[n])
}