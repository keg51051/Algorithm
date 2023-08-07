fun main() = with(System.`in`.bufferedReader()) {
    val (a,b) = readLine().split(" ").map { it.reversed().toInt() }
    println(a.coerceAtLeast(b))
}