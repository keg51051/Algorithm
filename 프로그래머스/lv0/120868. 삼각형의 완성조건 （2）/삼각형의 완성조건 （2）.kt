class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        var longest = 0
        var remain = 0
        if (sides[0] > sides[1]) {
            longest = sides[0]
            remain = sides[1]
        } else {
            longest = sides[1]
            remain = sides[0]
        }
        
        for (i in longest-remain+1..longest) {
            answer++
        }
        
        for (i in longest+1 until longest+remain) {
            answer++
        }
        
        return answer
    }
}