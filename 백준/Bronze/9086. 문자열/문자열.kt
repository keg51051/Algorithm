fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val a = readLine()
        println(a[0] + a.last().toString())
    }
}