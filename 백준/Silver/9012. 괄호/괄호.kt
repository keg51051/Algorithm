import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    var list = arrayListOf<String>()

    repeat(num) {
        list.add(br.readLine())
    }

    for (i in list.indices) {
        bw.write(isValid(list[i]).toString() + "\n")
    }

    br.close()
    bw.close()
}

fun isValid(p: String): String {
    val stack = Stack<Char>()

    p.forEach {
        when (it) {
            '(' -> stack.push(')')
            '{' -> stack.push('}')
            '[' -> stack.push(']')
            else -> {
                if (stack.isEmpty() || stack.pop() != it) {
                    return "NO"
                }
            }
        }
    }
    return if (stack.isEmpty()) "YES" else "NO"
}
