class Solution {
    fun solution(myStr: String): Array<String> {
        val s = myStr.split("[abc]".toRegex()).filter { it.isNotEmpty() }
        return if (s.isEmpty()) {
            arrayOf("EMPTY")
        } else {
            s.toTypedArray()
        }
    }
}