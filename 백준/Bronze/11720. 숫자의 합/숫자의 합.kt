fun main() {
    var a = readln().toInt()
    var b = readln()
    var answer = 0
    for (i in 0 until a) {
        answer += Character.getNumericValue(b[i])
    }
    println(answer)
}
