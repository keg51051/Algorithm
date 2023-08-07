fun main() = with(System.`in`.bufferedReader()) {
    val w = readLine()
    val wr = w.reversed()
    if (w.equals(wr)) print(1) else print(0)
}