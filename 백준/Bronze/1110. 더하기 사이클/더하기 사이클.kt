fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine()
    var temp = ""
    var idx = 1

    if (n.toInt() <= 9) n = "0$n"

    if (n[0].digitToInt() + n[1].digitToInt() > 9) {
        temp = n[1] + (n[0].digitToInt() + n[1].digitToInt()).toString()[1].toString()
    } else {
        temp = n[1] + (n[0].digitToInt() + n[1].digitToInt()).toString()
    }

    while (temp != n) {
        var tail = ""
        if (temp[0].digitToInt() + temp[1].digitToInt() > 9) {
            tail = (temp[0].digitToInt() + temp[1].digitToInt()).toString()[1].toString()
        } else {
            tail = (temp[0].digitToInt() + temp[1].digitToInt()).toString()
        }
        temp = temp[1] + tail
        idx++
    }
    print(idx)
}