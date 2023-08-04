fun main() = with(System.`in`.bufferedReader()) {
    val price = readLine().toInt()
    val n = readLine().toInt()
    var total = 0

    repeat(n) {
        val (p, q) = readLine().split(" ").map { it.toInt() }
        total += p * q
    }

    if (total == price) print("Yes") else print("No")
}