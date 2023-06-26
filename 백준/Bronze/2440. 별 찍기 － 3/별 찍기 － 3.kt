fun main() {
    var a = readln().toInt()

    for (i in a downTo 1) {
        repeat(i) {
            print("*")
        }
        println()
    }
}
