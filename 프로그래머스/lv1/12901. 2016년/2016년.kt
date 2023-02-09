class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        var day = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
        var dateByMonth = arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var date = 0;
        
        for (i in 0 until a-1) {
            date += dateByMonth[i]
        }
        date += b-1
        
        answer = day[date%7]
        
        return answer
    }
}