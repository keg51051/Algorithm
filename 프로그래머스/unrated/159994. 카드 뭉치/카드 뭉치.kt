class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var i1 = 0
        var i2 = 0
        for (i in goal) {
            if (i1 < cards1.size && i == cards1[i1]) {
                i1++
            } else if (i2 < cards2.size && i == cards2[i2]) {
                i2++
            } else {
                return "No"
            }
        }
        return "Yes"
    }
}