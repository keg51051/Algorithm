fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val sb = StringBuilder()

    for (i in 1 ..n) {
        sb.clear()
        repeat(n-i) {
            sb.append(" ")
        }

        repeat(2 * i - 1) {
            sb.append("*")
        }
        println(sb)
    }

    for (i in n-1 downTo 1) {
        sb.clear()
        repeat(n-i) {
            sb.append(" ")
        }

        repeat(2 * i - 1) {
            sb.append("*")
        }
        println(sb)
    }
}