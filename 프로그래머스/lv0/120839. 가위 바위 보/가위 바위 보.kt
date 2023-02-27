class Solution {
    fun solution(rsp: String): String {
        var arr = CharArray(rsp.length)
        for (i in 0 until rsp.length) {
            if (rsp[i] == '2') {
                arr[i] = '0'
            } else if (rsp[i] == '0') {
                arr[i] = '5'
            } else {
                arr[i] = '2'
            }
        }
        return arr.joinToString("")
    }
}