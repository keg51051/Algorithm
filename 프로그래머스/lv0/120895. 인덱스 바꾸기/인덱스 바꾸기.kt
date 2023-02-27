class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var arr = CharArray(my_string.length)
        for (i in 0 until my_string.length) {
            arr[i] = my_string[i]
        }
        
        arr[num1] = my_string[num2]
        arr[num2] = my_string[num1]
        
        return arr.joinToString("")
    }
}