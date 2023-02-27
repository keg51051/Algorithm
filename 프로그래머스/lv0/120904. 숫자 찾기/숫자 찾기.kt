class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = 0
        var str = num.toString()
        for (i in 0 until str.length) {
            if (Character.getNumericValue(str[i]) == k) {
                answer = i+1
                break;
            } else {
                answer = -1
            }
        }
        return answer
    }
}