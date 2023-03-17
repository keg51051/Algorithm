class Solution {
    fun solution(s: String) = s.withIndex()
        .map { (index, each) ->
            s.slice(0 until index)
                .lastIndexOf(each)
                .let { if (it == -1) -1 else index - it }
        }.toIntArray()
}