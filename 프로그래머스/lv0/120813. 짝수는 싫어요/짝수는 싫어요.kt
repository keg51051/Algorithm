class Solution {
    fun solution(n: Int): ArrayList<Int> {
        var answer = ArrayList<Int>()
        for (i in 1..n step 2) {
            answer.add(i)
        }
        return answer
    }
}