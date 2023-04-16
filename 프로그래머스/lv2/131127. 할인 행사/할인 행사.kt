class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        var want_ext = arrayOf<String>()
        for (i in number.indices) {
            for (j in 0 until number[i]) {
                want_ext += want[i]
            }
        }
        
        want_ext.sort()
        
        for (i in 0 until discount.size-9) {
            var discount_copy = discount.copyOfRange(i, i+10)
            discount_copy.sort()
            if (want_ext contentEquals discount_copy) {
                answer++
            }
        }
        
        return answer
    }
}