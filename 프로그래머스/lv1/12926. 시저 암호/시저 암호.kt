class Solution {
    fun solution(s: String, n: Int): String {
        val offset = n % 26
        
        if (offset == 0) return s
        
        var d: Char
        val chars = CharArray(s.length) 
        
        for ((i, c) in s.withIndex()) {
            if (c in 'A'..'Z') {
                d = c + offset
                if (d > 'Z') d -= 26
            }
            else if (c in 'a'..'z') {
                d = c + offset
                if (d > 'z') d -= 26
            }
            else
                d = c
            chars[i] = d
        }
        
        return chars.joinToString("")
    }
}