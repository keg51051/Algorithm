fun main() = with(System.`in`.bufferedReader()) {
    var (h,m) = readLine().split(" ").map { it.toInt() }
    val t = readLine().toInt()

    m += t

    if (m >= 60) {
        if (h == 23) h = m / 60 - 1 else h += m / 60
        h %= 24
        if (h == 24) h = 0
        m %= 60
        print("$h $m")
    } else {
        h %= 24
        if (h == 24) h = 0
        print("$h $m")
    }
}