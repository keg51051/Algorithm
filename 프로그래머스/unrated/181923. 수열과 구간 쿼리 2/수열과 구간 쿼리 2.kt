class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>) =
        queries.map { (s, e, k) ->
            var min = 1000000

            for (j in s..e) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j]
                }
            }

            if (min == 1000000) -1 else min
        }
}