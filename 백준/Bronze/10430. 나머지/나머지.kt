fun main() {
    val numbers = readln().split(" ")
    var a = numbers[0].toInt()
    var b = numbers[1].toInt()
    var c = numbers[2].toInt()
    println((a+b)%c)
    println(((a%c)+(b%c))%c)
    println((a*b)%c)
    println(((a%c)*(b%c))%c)
}