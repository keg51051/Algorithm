class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        var a = n.toString().map {
            it.toInt() - '0'.toInt()
        }
        
        return a.toIntArray().reversedArray()
    }
}