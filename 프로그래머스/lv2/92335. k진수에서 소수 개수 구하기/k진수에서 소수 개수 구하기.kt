class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        var list = n.toString(k).split('0').filter { it != "" }
        
        for (i in list) {
            if (isPrime(i.toLong())) answer++
        }
        
        return answer
    }
    
    fun isPrime(n: Long): Boolean {
        if(n <= 1) return false
        for(i in 2 ..Math.sqrt(n.toDouble()).toLong()){
            if(n % i==0L) return false
        }
        return true
    }
}