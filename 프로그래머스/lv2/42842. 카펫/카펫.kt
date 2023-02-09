class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = IntArray(2)
        var sum = brown + yellow
        for (i in 1..sum) {
            var x = i
            var y = sum / i
            if (x>y) {
                continue
            }
            
            if ((x-2)*(y-2) == yellow) {
                answer[0] = y
                answer[1] = x
                return answer
            }
        }
        return answer
    }
}