class Solution {
    fun solution(babbling: Array<String>): Int {
        var copy = babbling
        val arr = arrayOf("aya", "ye", "woo", "ma")
        val arr2 = arrayOf("ayaaya", "yeye", "woowoo", "mama")
        
        for (i in copy.indices) {
            for (j in arr.indices) {
                copy[i] = copy[i].replace(arr2[j], "x")
                copy[i] = copy[i].replace(arr[j], " ")
            }
        }
        
        for (i in copy.indices) {
            copy[i] = copy[i].replace(" ", "")
        }
        
        return copy.count { it == "" }
    }
}