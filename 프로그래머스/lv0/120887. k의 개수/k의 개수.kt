class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var answer: Int = 0
        var count = i
        var arr = IntArray(j-i+1)
        var a = ""
        for (x in 0..j-i) {
            arr[x] = count
            count++
        }
        a = arr.joinToString("")
        print(k.toString())
        
        return a.count{ it == k.toString()[0] }
    }
}