class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        var array = arr
        var temp = intArrayOf()
        while(true) {
            temp = array
            print(temp.contentToString())
            for (i in array.indices) {
                if (array[i] >= 50 && array[i] % 2 == 0) {
                    array[i] /= 2
                } else if (array[i] < 50 && array[i] % 2 != 0) {
                    array[i] = array[i] * 2 + 1
                } else {
                    array[i]
                }
            }
            if (array.equals(temp)) break else answer++
        }
        return answer
    }
}