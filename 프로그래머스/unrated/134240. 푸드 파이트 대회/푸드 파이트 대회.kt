class Solution {
    fun solution(food: IntArray): String {
        var a = ""
        var b = ""
        
        for (i in 0 until food.size) {
            for (j in 0 until food[i]/2) {
                if (food[i] > 1) {
                    a += i
                    b += i
                }
            }
        }
        
        return a + "0" + b.reversed()
    }
}