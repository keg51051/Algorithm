class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        val lIdx = str_list.indexOf("l")
        val rIdx = str_list.indexOf("r")

        if (lIdx < rIdx && lIdx != -1 || rIdx == -1) {
            answer = str_list.slice(0 until lIdx).toTypedArray()
            print("a")
        } else {
            answer = str_list.slice(rIdx+1 until str_list.size).toTypedArray()
        }
        return answer
    }
}