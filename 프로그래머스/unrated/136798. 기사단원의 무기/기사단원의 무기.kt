class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var arr = IntArray(number)
        for (i in 1..number) {
            arr[i - 1] = numOfDivisor(i)
        }
        
        for (j in arr.indices) {
            if (arr[j] > limit) {
                arr[j] = power
            }
        }
        
        return arr.sum()
    }
    
    fun numOfDivisor(n: Int): Int {
        var count = 0
        for (i in 1..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                count += if (i * i == n) 1 else 2
            }
        }
        return count
    }
}