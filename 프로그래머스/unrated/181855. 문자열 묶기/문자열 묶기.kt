class Solution {
    fun solution(strArr: Array<String>): Int {
        var length = IntArray(30)
        for (i in strArr) {
            length[i.length-1]++
        }
        return length.sortedDescending().first()
    }
}