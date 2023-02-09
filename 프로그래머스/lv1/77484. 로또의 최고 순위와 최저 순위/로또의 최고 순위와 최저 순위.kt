class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var nums = ArrayList<Int>()
        var right = 0
        var unknown = 0
        var best = 0
        var worst = 0
        
        for (i in lottos.indices) {
            if (win_nums.contains(lottos[i])) {
                nums.add(lottos[i])
                right++
            } else if (lottos[i] == 0) {
                nums.add(0)
                unknown++
            }
        }
        
        if (right != 0) {
            worst = 7-right
        } else {
            worst = 6
        }
        
        if (right == 0 && unknown == 0) {
            best = 6
        } else {
            best = 7-right-unknown
        }
        
        answer = intArrayOf(best, worst)
        return answer
    }
}