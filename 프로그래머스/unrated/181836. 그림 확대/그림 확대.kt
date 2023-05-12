class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for (i in picture) {
            var st = StringBuilder()
            for (j in 0 until i.length) {
                var temp = i[j]
                repeat(k) {
                    st.append(temp)
                }
            }
            repeat(k) {
                answer += st.toString()
            }
        }
        return answer
    }
}