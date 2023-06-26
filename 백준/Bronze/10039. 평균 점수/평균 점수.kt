fun main() {
    var list = arrayListOf<Int>()

    repeat(5) {
        var a = readln().toInt()
        if (a < 40) {
            list.add(40)
        } else {
            list.add(a)
        }
    }

    println(list.average().toInt())
}
