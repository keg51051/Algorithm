fun main(args: Array<String>) {
    var integers = readln().split(" ").map { it.toInt() }

    println(integers[0] - integers[1])
}