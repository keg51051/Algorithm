import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    println(gcd(n, m))
    print(lcm(n, m))

    br.close()
}

fun gcd(n: Int, m: Int): Int {
    if (m == 0) {
        return n
    } else {
        return gcd(m, n % m)
    }

}

fun lcm(n: Int, m: Int): Int {
    if (n > m) {
        return (n / gcd(n, m)) * m
    } else {
        return (m / gcd(n, m)) * n
    }
}