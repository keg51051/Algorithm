class Solution {
    fun solution(s: String): IntArray {
        var count = 0
        var removeCount = 0
        var list = ArrayList<Int>()
        var temp = s
        
        while (temp != "1") {
            list = ArrayList<Int>()
            temp.forEach {
                if(it == '1') {
                    list.add(1)
                } else {
                    removeCount++
                }
            }
            temp = Integer.toBinaryString(list.size)
            count++
        }
        
        return intArrayOf(count, removeCount)
    }
}