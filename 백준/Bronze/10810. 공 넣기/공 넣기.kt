fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n)
    repeat(m) {
        val (i,j,k) = readLine().split(" ").map { it.toInt() }
        for (n in i-1 until j) {
            arr[n] = k
        }
    }
    print(arr.joinToString(" "))
}