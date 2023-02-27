class Solution {
    fun solution(my_string: String): String {
        var arr = CharArray(my_string.length)
        for (i in 0 until my_string.length) {
            if (my_string[i].isUpperCase()) {
                arr[i] = my_string[i].toLowerCase()
            } else {
                arr[i] = my_string[i].toUpperCase()
            }
        }
        return arr.joinToString("")
    }
}