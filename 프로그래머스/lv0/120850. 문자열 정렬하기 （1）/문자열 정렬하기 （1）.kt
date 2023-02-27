class Solution {
    fun solution(my_string: String): IntArray {
        var answer = ArrayList<Int>()
        for (i in my_string) {
            if (i in '0'..'9') {
                answer.add(Character.getNumericValue(i))
            }
        }
        answer.sort()
        return answer.toIntArray()
    }
}