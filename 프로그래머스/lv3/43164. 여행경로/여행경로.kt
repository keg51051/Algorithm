import java.util.Stack

class Solution {
    var check = booleanArrayOf()
    val stack = Stack<String>()
    val list = mutableListOf<String>()
    
    fun dfs(tickets: Array<Array<String>>, depth: Int) {
        if (depth == tickets.size) {
            list.add(stack.joinToString(","))
        } else {
            val next = stack.peek()
            for (i in tickets.indices) {
                if (check[i]) continue
                if (tickets[i][0] == next) {
                    check[i] = true
                    stack.push(tickets[i][1])
                    dfs(tickets, depth + 1)
                    stack.pop()
                    check[i] = false
                }
            }
        }
    }
    
    fun solution(tickets: Array<Array<String>>): Array<String> {
        for (i in tickets.indices) {
            if (tickets[i][0] == "ICN") {
                check = BooleanArray(tickets.size)
                check[i] = true
                stack.push("ICN")
                stack.push(tickets[i][1])
                dfs(tickets, 1)
                stack.pop()
                stack.pop()
            }
        }
        return list.sorted()[0].split(",").toTypedArray()
    }
}