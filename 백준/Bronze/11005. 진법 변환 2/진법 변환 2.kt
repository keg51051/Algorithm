fun main() = with(System.`in`.bufferedReader()) {
    val (n, b) = readLine().split(" ").map { it.toInt() }

    print(n.toString(b).toUpperCase())
}