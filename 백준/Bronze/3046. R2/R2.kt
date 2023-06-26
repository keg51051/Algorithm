fun main() {
    val list = readln().split(" ", limit=2).map { it.toInt() }

    println(2*list[1]-list[0])
}
