import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var num = 2.0
    for (i in 0 until n) {
        num += 2.0.pow(i)
    }
    print((num*num).toInt())
}