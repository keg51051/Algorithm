fun main() = with(System.`in`.bufferedReader()) {
    val yArr = List(28) { readLine()!!.toInt() }
    val nArr = (1..30).filterNot { yArr.contains(it) }
    println(nArr.min())
    print(nArr.max())
}