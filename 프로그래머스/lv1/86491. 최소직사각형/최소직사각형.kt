class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var a = 0
        var b = 0
        
        sizes.forEach {
            it.sort()
            a = it.first().coerceAtLeast(a)
            b = it.last().coerceAtLeast(b)
        }
        return a*b
    }
}