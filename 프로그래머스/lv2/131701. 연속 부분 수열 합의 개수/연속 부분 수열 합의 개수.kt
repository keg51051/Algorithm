class Solution {
    fun solution(elements: IntArray): Int {
        var arr = elements + elements
        val set = mutableSetOf<Int>()
        for (i in 1..elements.size) {
            for (j in 0..elements.size) {
                set.add(arr.copyOfRange(j, j+i).sum())
            }
        }
        return set.size
    }
}