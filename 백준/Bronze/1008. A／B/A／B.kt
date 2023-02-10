fun main() {
    var numbers = readln().split(" ").map { it.toDouble() }

    println(numbers[0] / numbers[1])
}