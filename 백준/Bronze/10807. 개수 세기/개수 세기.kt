fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }
    val num = readLine().toInt()

    print(arr.count { it == num })
}