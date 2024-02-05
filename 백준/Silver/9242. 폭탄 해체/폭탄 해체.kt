import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    // 0 to 9
    val numbers = arrayOf(
        arrayOf("***", "* *", "* *", "* *", "***"),
        arrayOf("  *", "  *", "  *", "  *", "  *"),
        arrayOf("***", "  *", "***", "*  ", "***"),
        arrayOf("***", "  *", "***", "  *", "***"),
        arrayOf("* *", "* *", "***", "  *", "  *"),
        arrayOf("***", "*  ", "***", "  *", "***"),
        arrayOf("***", "*  ", "***", "* *", "***"),
        arrayOf("***", "  *", "  *", "  *", "  *"),
        arrayOf("***", "* *", "***", "* *", "***"),
        arrayOf("***", "* *", "***", "  *", "***")
    )

    val input = mutableListOf<String>()
    val divided = mutableListOf<String>()
    val result = mutableListOf<Boolean>()
    val code = mutableListOf<Int>()

    repeat(5) {
        input.add(br.readLine())
    }

    // 길이가 안맞으면 바로 boom (예제 3번)
    if (input[0].length % 4 != 3) {
        return print("BOOM!!")
    }

    for (i in input[0].indices) {
        repeat(5) {
            if (i % 4 == 0) {
                divided.add(input[it].substring(i, i+3))
            }
        }
    }

    for (i in divided.indices step 5) {
        var match = false
        for (j in numbers.indices) {
            if (divided[i] == numbers[j][i%5]
                && divided[i+1] == numbers[j][i%5+1]
                && divided[i+2] == numbers[j][i%5+2]
                && divided[i+3] == numbers[j][i%5+3]
                && divided[i+4] == numbers[j][i%5+4]) {
                code.add(j)
                match = true
                break
            }
        }
        result.add(match)
    }

    if (result.contains(false) || code.joinToString("").toInt() % 6 != 0) print("BOOM!!") else print("BEER!!")

}