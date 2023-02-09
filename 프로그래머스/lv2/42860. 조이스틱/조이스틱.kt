class Solution {
    fun solution(name: String): Int {
        var answer = 0
        var move = name.length - 1
        
        for (i in name.indices) {
            answer += (name[i] - 'A').coerceAtMost('Z' - name[i] + 1)
            var idx = i + 1
            
            while (idx < name.length && name[idx] == 'A') idx++
            
            move = move.coerceAtMost(i * 2 + name.length - idx)
            move = move.coerceAtMost((name.length-idx) * 2 + i)
        }
        
        return answer + move
    }
}