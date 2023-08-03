import kotlin.text.StringBuilder

private var n = 0
private var m = 0
val arr = arrayListOf<Int>()
val sb = StringBuilder()

fun main() = with(System.`in`.bufferedReader()) {
    val nm = readLine().split(" ").map { it.toInt() }
    n = nm[0]
    m = nm[1]
    dfs(1, 0)
    println(sb)
}

fun dfs(start: Int, depth: Int) {
    if (depth == m) {
        for (i in arr) {
            sb.append(i).append(' ')
        }
        sb.append('\n')
        return
    }

    for (i in 1 .. n) {
        arr.add(i)
        dfs(i, depth+1)
        arr.removeLast()
    }
}