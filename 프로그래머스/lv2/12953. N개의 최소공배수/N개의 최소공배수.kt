class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr[0]
        
        arr.forEach {
            answer = lcm(answer, it)
        }
        
        return answer
    }
    
    fun lcm(a:Int, b:Int) = a * b / gcd(a,b)
    
    fun gcd(a:Int, b:Int): Int {
        var A = a
        var B = b
        while(B>0) {
            var tmp = B
            B = A%B
            A = tmp
        }
        return A
    }
}