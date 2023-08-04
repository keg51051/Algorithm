fun main() = with(System.`in`.bufferedReader()) {
    var yArr = IntArray(28)
    var nArr = intArrayOf()
    repeat(28) {
        yArr += readLine().toInt()
    }

    for (i in 1..30) {
        if (!yArr.contains(i)) {
            nArr += i
        }
    }
    println(nArr.min())
    print(nArr.max())
}