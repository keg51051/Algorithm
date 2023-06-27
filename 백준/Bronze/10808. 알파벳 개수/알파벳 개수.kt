fun main() {
    var map = mutableMapOf<Char, Int>()

    for (c in 'a'..'z') {
        map.put(c, 0)
    }

    val str = readln()

    for (c in str) {
        var i = map[c]!!.plus(1)
        map.put(c, i)
    }

    println(map.values.joinToString(" "))
}
