fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n)
    for (i in arr.indices) {
        arr[i] = i+1
    }
    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        val temp = arr[a-1]
        arr[a-1] = arr[b-1]
        arr[b-1] = temp
    }
    print(arr.joinToString(" "))
}