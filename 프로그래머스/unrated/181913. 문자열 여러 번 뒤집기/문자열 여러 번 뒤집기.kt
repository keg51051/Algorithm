class Solution {
    fun solution(my_string: String, queries: Array<IntArray>) = queries.fold(my_string) { acc, query -> acc.substring(0, query[0]) + acc.substring(query[0], query[1]+1).reversed() + acc.substring(query[1]+1, acc.length)}
}