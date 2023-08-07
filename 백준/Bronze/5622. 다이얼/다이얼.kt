fun main() = with(System.`in`.bufferedReader()) {
    val word = readLine().map { it }
    val num = arrayListOf<Int>()
    for (w in word) {
        when (w) {
            in 'A'..'C' -> num.add(2)
            in 'D' .. 'F' -> num.add(3)
            in 'G' .. 'I' -> num.add(4)
            in 'J' .. 'L' -> num.add(5)
            in 'M' .. 'O' -> num.add(6)
            in 'P' .. 'S' -> num.add(7)
            in 'T' .. 'V' -> num.add(8)
            else -> num.add(9)
        }
    }
    print(num.sum().plus(num.size))
}