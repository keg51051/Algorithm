class Solution {
    fun solution(n: Int): MutableSet<Int> {
        var set = mutableSetOf<Int>()
        var num = n
        var i = 2
        
        while (i * i <= n) {
            while (num % i == 0) {
                num /= i
                set.add(i)
            }
            i++
        }
        
        if (num > 1) {
            set.add(num)
        }
        
        return set
    }
}