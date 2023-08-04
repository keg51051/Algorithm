fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val n = readLine().toInt() / 4
    repeat(n) {
        sb.append("long ")
    }
    sb.append("int")
    print(sb)
}