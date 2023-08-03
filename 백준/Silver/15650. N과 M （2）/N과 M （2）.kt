private var n = 0
private var m = 0
val arr = arrayListOf<Int>()

fun main() = with(System.`in`.bufferedReader()) {
    val nm = readLine().split(" ").map { it.toInt() }
    n = nm[0]
    m = nm[1]
    dfs(1, 0)
}

fun dfs(start: Int, depth: Int) {
    if (depth == m) {
        for (i in arr) {
            print("$i ")
        }
        println()
        return
    }

    for (i in start .. n) {
        arr.add(i)
        dfs(i+1, depth+1)
        arr.removeLast()
    }
}