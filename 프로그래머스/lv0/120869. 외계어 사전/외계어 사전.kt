class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var answer: Int = 2
        var count = IntArray(dic.size)
        for (i in 0 until dic.size) {
            for (j in 0 until spell.size) {
                if (dic[i].contains(spell[j])) {
                    count[i]++
                }
            }
            if (count[i] >= spell.size) {
                answer = 1
            }
        }
        return answer
    }
}