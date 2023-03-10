class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray
        val arr = Array(n) { IntArray(n) }
        val max = n * (n + 1) / 2
        var top = 0 
        var left = 0 
        var bottom = n - 1 
        var right = n - 1 
        var value = 1
        while (max >= value) {
            for (i in top..bottom) { 
                if (max < value) break
                arr[i][left] = value++
            }
            if (max < value) break
            top++
            left++
            for (j in left..right) { 
                if (max < value) break
                arr[bottom][j] = value++
            }
            if (max < value) break
            bottom--
            right--
            var index = right
            for (i in bottom downTo top) { 
                if (max < value) {
                    break
                }
                arr[i][index--] = value++
            }
            top++
            right--
        }
        answer = IntArray(max)
        var index = 0
        for (i in 0 until n) {
            for (j in 0..i) {
                answer[index++] = arr[i][j]
            }
        }
        return answer
    }
}