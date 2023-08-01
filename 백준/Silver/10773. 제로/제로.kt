import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val stack = Stack<Int>()

    repeat(n) {
        val i = br.readLine().toInt()
        if (i != 0) {
            stack.push(i)
        } else {
            stack.pop()
        }
    }

    print(stack.sum())

    br.close()
}