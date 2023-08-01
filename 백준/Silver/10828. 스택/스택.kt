import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val stack = Stack<Int>()

    repeat(n) {
        when (val input = br.readLine()) {
            "pop" -> if (stack.isNotEmpty()) {
                println(stack.pop())
            } else {
                println(-1)
            }
            "empty" -> if (stack.isEmpty()) println(1) else println(0)
            "top" -> if (stack.isNotEmpty()) println(stack.peek()) else println(-1)
            "size" -> println(stack.size)
            else -> stack.push(input.split(" ")[1].toInt())
        }
    }

    br.close()
}