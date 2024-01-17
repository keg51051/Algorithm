import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val stack = Stack<Int>()
    val brackets = mutableListOf<MutableList<Int>>()
    val arr = mutableListOf<Int>()
    val set = mutableSetOf<String>()

    for (i in input.indices) {
        if (input[i] == '(') {
            stack.push(i)
        } else if (input[i] == ')') {
            brackets.add(mutableListOf(stack.pop(), i))
        }
    }

    fun dfs(idx: Int, depth: Int) {
        if (depth == 0) {
            val sb = StringBuilder(input)
            for (i in arr) {
                sb.setCharAt(brackets[i][0], ' ')
                sb.setCharAt(brackets[i][1], ' ')
            }
            set.add(sb.toString().replace(" ", ""))
        } else {
            for (i in idx..<brackets.size) {
                arr.add(i)
                dfs(i+1, depth-1)
                arr.removeLast()
            }
        }
    }

    for (i in 1..brackets.size) {
        dfs(0, i)
    }

    set.sorted().forEach {
        println(it)
    }

    br.close()
}