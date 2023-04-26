class Solution {
    fun solution(n: Int) = generateSequence(n) {
        if (it % 2 == 0) it / 2 else it * 3 + 1
    }.takeWhile { it != 1 }.toList() + 1
}