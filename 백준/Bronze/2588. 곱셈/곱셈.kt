fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine()
    val b = readLine()

    println(a.toInt() * b[2].digitToInt())
    println(a.toInt() * b[1].digitToInt())
    println(a.toInt() * b[0].digitToInt())
    print(a.toInt() * b.toInt())
}