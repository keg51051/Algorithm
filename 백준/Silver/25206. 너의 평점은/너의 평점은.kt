fun main() = with(System.`in`.bufferedReader()) {
    var i = 0.0
    var total = 0.0
    repeat(20) {
        val (a, b, c) = readLine().split(" ")
        if (c != "P") {
            i += b.toDouble()
            when (c) {
                "A+" -> total += b.toDouble() * 4.5
                "A0" -> total += b.toDouble() * 4.0
                "B+" -> total += b.toDouble() * 3.5
                "B0" -> total += b.toDouble() * 3.0
                "C+" -> total += b.toDouble() * 2.5
                "C0" -> total += b.toDouble() * 2.0
                "D+" -> total += b.toDouble() * 1.5
                "D0" -> total += b.toDouble() * 1.0
                else -> total
            }
        }
    }

    print (total / i)
}