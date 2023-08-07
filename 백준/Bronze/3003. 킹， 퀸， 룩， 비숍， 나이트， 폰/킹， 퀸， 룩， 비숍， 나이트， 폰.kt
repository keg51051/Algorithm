fun main() = with(System.`in`.bufferedReader()) {
    val chess = arrayListOf(1, 1, 2, 2, 2, 8)
    val nums = readLine().split(" ").map { it.toInt() }

    print(chess.mapIndexed { i, v -> v - nums[i] }.joinToString(" "))
}