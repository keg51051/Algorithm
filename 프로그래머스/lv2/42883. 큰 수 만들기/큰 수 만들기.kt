import java.util.*

class Solution {
    fun solution(number: String, k: Int): String {
        val stack = Stack<Char>()
        var del = k
        number.forEach {
            while(stack.isNotEmpty() && stack.peek() < it && del > 0 ) {
                stack.pop()
                del--
            }
            stack.push(it)
        }
        for(i in 1..del) stack.pop()
        return stack.toArray().joinToString("")
    }
}