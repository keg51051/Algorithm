class Solution {
    fun solution(names: Array<String>) = names.filterIndexed { i, _ -> i % 5 == 0 }
}