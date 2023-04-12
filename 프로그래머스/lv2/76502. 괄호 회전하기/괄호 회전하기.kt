import java.util.Stack

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var temp = ""
        for (i in 0 until s.length) {
            temp = s.substring(i) + s.substring(0 until i)
            if (isValid(temp)) answer++
        }
        return answer
    }
    
    fun isValid(s: String): Boolean {
        var stack = Stack<String>()
        s.forEach {
            when(it.toString()){
                "{"->stack.push("}")

                "("->stack.push(")")
                "["->stack.push("]")
                else-> {
                    if(stack.isEmpty()||stack.pop()!=it.toString()){
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}