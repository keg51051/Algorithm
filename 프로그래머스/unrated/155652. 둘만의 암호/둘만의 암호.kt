class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        var list = mutableListOf<Char>()
        
        for (c in 'a'..'z') {
            if (c !in skip) {
                list.add(c)
            }
        }
        
        for (i in s) {
            var idx = list.indexOf(i) + index
            if (idx >= list.size) {
                idx %= list.size
            }
            answer += list[idx]
        }
        
        return answer
    }
}