fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        val a = readLine()
        if (a.isNullOrBlank()) break else println(a)
    }
}