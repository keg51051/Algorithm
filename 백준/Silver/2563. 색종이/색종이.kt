fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val board = Array(100) { Array(100) {0} }

    repeat(n) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        for (i in x until x + 10) {
            for (j in y until y + 10) {
                board[i][j]++
            }
        }
    }
    print(board.flatten().count { it >= 1 })
}