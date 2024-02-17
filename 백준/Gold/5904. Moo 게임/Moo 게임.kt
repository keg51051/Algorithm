import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()

    moo(n, 3, 1)
}

fun moo(n: Int, len: Int, i: Int) {
    val length = 2 * len + i + 3

    when {
        n == 1 -> print("m")
        n == 2 || n == 3 -> print("o")

        length < n -> moo(n, length, i + 1)
        n in len..length - len -> {
            if (n == len + 1) print("m") else print("o")
        }

        else -> moo(n - (len + i + 3), 3, 1)
    }
}