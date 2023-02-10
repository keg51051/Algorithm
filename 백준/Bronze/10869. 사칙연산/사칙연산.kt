fun main() {
    var numbers = readln().split(" ").map { it.toInt() }

    println(numbers[0] + numbers[1])
    println(numbers[0] - numbers[1])
    println(numbers[0] * numbers[1])
    println(numbers[0] / numbers[1])
    println(numbers[0] % numbers[1])
}