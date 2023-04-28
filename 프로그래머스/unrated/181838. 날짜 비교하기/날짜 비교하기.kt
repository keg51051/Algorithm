class Solution {
    fun solution(date1: IntArray, date2: IntArray) = (date1.joinToString("").toInt() < date2.joinToString("").toInt()).compareTo(false)
}