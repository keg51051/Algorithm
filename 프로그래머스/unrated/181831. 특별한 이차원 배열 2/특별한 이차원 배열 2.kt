class Solution {
    fun solution(arr: Array<IntArray>) = arr.indices.all {i -> arr.indices.all { j -> arr[i][j] == arr[j][i] } }.compareTo(false)
}