class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        val answer = if (arr1.size != arr2.size) {
            if (arr1.size > arr2.size) 1 else -1
        } else {
            arr1.sum().compareTo(arr2.sum())
        }
        return answer
    }
}