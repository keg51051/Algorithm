fun main() = with(System.`in`.bufferedReader()) {
    var max = 0
    var x = 0
    var y = 0

    repeat(9) {
        val nums = readLine().split(" ").map { it.toInt() }

        nums.forEachIndexed { i, v ->
            if (max < v) {
                x = it + 1
                y = i + 1
                max = v
            }
        }
    }
    if (max == 0) {
        print("$max\n1 1")
    } else {
        print("$max\n$x $y")
    }
}