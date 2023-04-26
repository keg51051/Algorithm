class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>) = intervals.flatMap { arr.slice(it[0]..it[1]) }
}