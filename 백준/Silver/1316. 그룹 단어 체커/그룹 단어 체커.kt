fun main() {
    val list = mutableListOf<String>()

    val n = readln().toInt()
    var answer = 0

    repeat(n) {
        list.add(readln())
    }

    for (i in list) {
        if (groupWord(i)) answer++
    }

    println(answer)
}

fun groupWord(s: String): Boolean {
    var set = mutableSetOf<Char>()
    var last = 'a'

    for (c in s) {
        if (set.contains(c) && c != last) {
            return false
        }
        set.add(c)
        last = c
    }

    return true
}
