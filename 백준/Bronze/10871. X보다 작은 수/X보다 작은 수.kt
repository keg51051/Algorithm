fun main() {
    val input = readln().split(" ")
    val n = input[0].toInt()
    val x = input[1].toInt()
    val numbers = readln().split(" ")
    repeat(n) {
        if(numbers[it].toInt() < x) print(numbers[it] + " ")
    }
}