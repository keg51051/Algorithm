class Solution {
    fun solution(a: Int, b: Int) = 
    maxOf((a.toString() + b.toString()).toInt(), (b.toString() + a.toString()).toInt())
}