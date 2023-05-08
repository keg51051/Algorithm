class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        var temp = arr.copyOf()
        while(true) {
            for (i in arr.indices) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2
                else if (arr[i] < 50 && arr[i] % 2 == 1) arr[i] = arr[i] * 2 + 1
            }
            
            if (temp.contentEquals(arr)) break
            temp = arr.copyOf()
            answer++
        }
        return answer
    }
}