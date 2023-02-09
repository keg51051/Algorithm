class Solution {
    fun solution(w: Int, h: Int) = w.toLong()*h.toLong() - (w+h - gcd(w,h))
    
    fun gcd(n:Int, m:Int):Int{
        return if(n < m){
            if(n == 0) m else gcd(n, m % n)
        }else{
            if(m == 0) n else gcd(m, n % m)
        }
    }
}