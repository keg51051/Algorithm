class Solution {
    fun solution(s: String): Int {
        var string = s
        val numbers = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        
        for (i in 0..9) {
            string = string.replace(numbers[i], i.toString())
        }
        return string.toInt()
    }
}