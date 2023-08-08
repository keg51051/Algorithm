fun main() = with(System.`in`.bufferedReader()) {
    val lines = arrayListOf<String>()
    val answer = arrayListOf<Char>()
    repeat(5) {
        lines.add(readLine())
    }

    for (i in 0 until 15) {
        for (j in 0 until 5) {
            try {
                answer.add(lines[j][i])
            } catch (e: IndexOutOfBoundsException) { }
        }
    }

    print(answer.joinToString(""))

}