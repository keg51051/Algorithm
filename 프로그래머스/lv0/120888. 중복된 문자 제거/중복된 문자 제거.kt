class Solution {
    fun solution(my_string: String): String {
        var list = ArrayList<Char>()
        for (i in my_string) {
            list.add(i)
        }
        return list.distinct().joinToString("")
    }
}