class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk = mutableListOf<Int>()
        var i = 0
        while (i < arr.size) {
            if (stk.isEmpty()) {
                stk.add(arr[i])
                i++
            } else if (stk.last() < arr[i]) {
                stk.add(arr[i])
                i++
            } else if (stk.last() >= arr[i]) {
                stk.remove(stk.last())
            }
        }
        
        return stk.toIntArray()
    }
}