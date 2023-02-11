fun main() {
    val numbers = readln().split(" ")
    var a = numbers[0].toInt()
    var b = numbers[1].toInt()

    if (a<b) {
        println("<")
    } else if(a>b) {
        println(">")
    } else {
        println("==")
    }
}