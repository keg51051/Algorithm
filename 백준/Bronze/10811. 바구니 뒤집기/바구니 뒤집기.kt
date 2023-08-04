fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val arr = MutableList(n) { it+1 }

    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        arr.subList(a-1, b).reverse()
    }
    print(arr.joinToString(" "))
}