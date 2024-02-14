import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val text = br.readLine()
    val stack = Stack<Int>()
    var pieces = 0

    for (i in text.indices) {
        if (text[i] == '(') {
            stack.push(i)
        } else {
            if (stack.peek() == i-1) {
                stack.pop()
                pieces += stack.size
            } else {
                stack.pop()
                pieces += 1
            }
        }
    }

    print(pieces)
}