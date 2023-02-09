class Solution {
    fun solution(record: Array<String>): Array<String> {
        val users = HashMap<String, String>()
        
        return record.map {
            val str = it.split(" ")
            val action = str.first()
            if (action != "Leave") {
                users += str[1] to str[2]
            }
            str
        }.asSequence().filter {
            it[0] != "Change"
        }.map {
            val name = users[it[1]]
            val msg = when (it[0]) {
                "Enter" -> "님이 들어왔습니다."
                "Leave" -> "님이 나갔습니다."
                else -> ""
            }
            "$name$msg"
        }.toList().toTypedArray()
    }
}