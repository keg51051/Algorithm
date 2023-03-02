class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        val x = ArrayList<Int>()
        val y = ArrayList<Int>()
        
        for (i in dots) {
            x.add(i[0])
            y.add(i[1])
        }
        
        answer = (x.maxOrNull()!! - x.minOrNull()!!) * (y.maxOrNull()!! - y.minOrNull()!!)
        
        return answer
    }
}