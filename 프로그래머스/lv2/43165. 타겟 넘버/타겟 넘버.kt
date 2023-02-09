class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        return numbers.fold(listOf(0)) { list, i ->
            list.map {it + i} + list.map {it - i}
        }.count {it == target}
    }
}