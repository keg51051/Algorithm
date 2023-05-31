import java.util.Stack
class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var stack = Stack<Int>()
        for (i in ingredient) {
            stack.push(i)
             if (stack.size >= 4) {
                if (stack.takeLast(4) == listOf(1,2,3,1)) {
                    answer++
                    repeat(4) {
                        stack.pop()
                    }
                }
            }
        }
        return answer
    }
}