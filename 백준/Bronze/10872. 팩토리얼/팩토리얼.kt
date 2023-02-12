fun main() {
    val n = readln().toInt()
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    print(factorial)
}