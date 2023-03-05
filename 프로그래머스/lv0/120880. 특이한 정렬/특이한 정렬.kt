import kotlin.math.abs

class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        var list = ArrayList<Int>()
        
        for (i in numlist) {
            list.add(i)
        }
        
        list.sortWith { a,b ->
            if (abs(a-n) == abs(b-n)) {
                b.compareTo(a)
            } else {
                abs(a-n).compareTo(abs(b-n))
            }
        }
        
        return list.toIntArray()
    }
}