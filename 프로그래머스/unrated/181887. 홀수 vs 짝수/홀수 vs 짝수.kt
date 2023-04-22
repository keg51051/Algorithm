class Solution {
    fun solution(num_list: IntArray): Int {
        var odd = num_list.filterIndexed { i, _ -> i % 2 != 0 }.sum()
        var even = num_list.filterIndexed { i, _ -> i % 2 == 0 }.sum()
        
        return if (odd > even) odd else even
    }
}