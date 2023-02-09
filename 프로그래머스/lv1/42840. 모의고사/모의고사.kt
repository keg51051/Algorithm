class Solution {
    fun solution(answers: IntArray): IntArray {
        var score = IntArray(3)
        val list = mutableListOf<Int>()
        
        val a = intArrayOf(1,2,3,4,5)
        val b = intArrayOf(2,1,2,3,2,4,2,5)
        val c = intArrayOf(3,3,1,1,2,2,4,4,5,5)
        
        for (i in answers.indices) {
            if(answers[i] == a[i % a.size]) {
                score[0]++
            }
            if(answers[i] == b[i % b.size]) {
                score[1]++
            }
            if(answers[i] == c[i % c.size]) {
                score[2]++
            }
        }
        
        val max = score.max()
        
        if (max == score[0]) {
            list.add(1)
        }
        if (max == score[1]) {
            list.add(2)
        }
        if (max == score[2]) {
            list.add(3)
        }
               
        return list.toIntArray()
        
    }
}