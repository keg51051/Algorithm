class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var number = num
        while(number != 1) {
            if (number % 2 == 0) {
                number = number / 2
                answer++
            } else if (answer >= 450) {
                answer = -1
                break
            } else {
                number = number * 3 + 1
                answer++
            }
        }
        return answer
    }
}