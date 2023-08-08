fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val coins = IntArray(4)

    repeat(n) {
        var change = readLine().toInt()
        coins[0] = change / 25
        change %= 25
        coins[1] = change / 10
        change %= 10
        coins[2] = change / 5
        change %= 5
        coins[3] = change / 1
        change %= 1
        println(coins.joinToString(" "))
    }
}