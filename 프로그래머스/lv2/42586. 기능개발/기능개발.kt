class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = ArrayList<Int>()
        var pro = progresses
        var list = ArrayList<Int>()
        var num = 0
        
        for (i in progresses.indices) {
            num = 0
            while (pro[i] < 100) {
                pro[i] += speeds[i]
                num++
            }
            list.add(num)
        }
        
        var count = 0
        var flag = 0
        
        for (j in list) {
            if (flag == 0) {
                flag = j
                count++
            } else {
                if (flag >= j) {
                    count++
                } else {
                    flag = j
                    answer.add(count)
                    count = 1
                }
            }
        }
        answer.add(count)
                
        return answer.toIntArray()
    }
}