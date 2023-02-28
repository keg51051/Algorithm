import kotlin.math.abs
class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer = 0
        var list = ArrayList<Int>()
        for (i in 0 until array.size) {
            list.add(abs(array.sorted()[i] - n))
        }
        answer = array.sorted()[list.indexOf(list.minOrNull())]
        return answer
    }
}