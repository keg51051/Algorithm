class Solution {
    fun solution(new_id: String): String {
        var answer: String = ""
        var list = mutableListOf<Char>()
        
        // step 1
        answer = new_id.toLowerCase()
        
        // step 2
        answer.forEach {
            if (it in 'a'..'z' || it in '0'..'9' || it == '-' || it == '_' || it == '.') {
                list.add(it)
            }
        }
        answer = list.joinToString("")
        
        // step 3
        while (answer.contains("..")) {
            answer = answer.replace("..", ".")
        }
        
        // step 4
        if (answer.startsWith(".")) {
            answer = answer.drop(1)
        }
        if (answer.endsWith(".")) {
            answer = answer.removeRange(answer.length-1, answer.length)
        }
        
        // step 5
        if (answer.isNullOrEmpty()) {
            answer = "a"
        }
        
        // step 6
        if (answer.length >= 16) {
            answer = answer.removeRange(15, answer.length)
        }
        if (answer.endsWith(".")) {
            answer = answer.removeRange(answer.length-1, answer.length)
        }
        
        // step 7
        if (answer.length <= 2) {
            list = answer.toMutableList()
            for (i in answer.length..2) {
                list.add(answer[answer.length-1])
            }
            answer = list.joinToString("")
        }
        
        return answer
    }
}