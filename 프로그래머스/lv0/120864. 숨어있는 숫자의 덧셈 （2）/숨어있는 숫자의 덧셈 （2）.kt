class Solution {
    fun extractNumbersFromString(str: String): List<Int> {
        val regex = Regex("\\d+")
        val matches = regex.findAll(str)
        val numbers = mutableListOf<Int>()
        for (match in matches) {
            numbers.add(match.value.toInt())
        }
        return numbers
    }
    
    fun solution(my_string: String): Int {
        var list = extractNumbersFromString(my_string)
        
        return list.sum()
    }
}