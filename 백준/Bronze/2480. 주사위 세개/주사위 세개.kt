fun main() {
    var a = readln().split(" ", limit=3).map { it.toInt() }

    if (a[0] == a[1] && a[1] == a[2]) {
        println(10000 + a[0] * 1000)
    } else if (a[0] == a[1] || a[0] == a[2]) {
        println(1000 + a[0] * 100)
    } else if (a[1] == a[2]) {
        println(1000 + a[1] * 100)
    } else {
        println(a.max() * 100)
    }

}
