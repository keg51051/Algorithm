class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var line = IntArray(200)
        
        for (i in lines) {
            for (j in i[0] + 100 until i[1] + 100) {
                line[j]++
            }
        }
        
        return line.filter { it > 1 }.count()
    }
}