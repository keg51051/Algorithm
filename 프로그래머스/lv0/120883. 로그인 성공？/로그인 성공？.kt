class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = ""
        val id = id_pw[0]
        val pw = id_pw[1]
        
        for (i in db) {
            if (i[0] == id && i[1] == pw) {
                answer = "login"
                break
            } else if (i[0] == id && i[1] != pw) {
                answer = "wrong pw"
                break
            } else {
                answer = "fail"
            }
        }
        return answer
    }
}