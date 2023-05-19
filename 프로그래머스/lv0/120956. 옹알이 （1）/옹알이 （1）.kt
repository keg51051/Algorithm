class Solution {
    fun solution(babbling: Array<String>): Int {
        val possible = arrayOf("aya", "ye", "woo", "ma")
        var temp = ""
        var arr = arrayOf<String>()
        
        for (i in babbling) {
            temp = i
            for (j in possible) {
                temp = temp.replace(j, " ")
            }
            arr += temp
        }
        
        return arr.filter { it.isBlank() }.count()
    }
}