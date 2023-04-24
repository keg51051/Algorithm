class Solution {
    fun solution(binomial: String): Int {
        var list = binomial.split(" ")
        when (list[1]) {
            "+" -> return list[0].toInt() + list[2].toInt()
            "-" -> return list[0].toInt() - list[2].toInt()
            else -> return list[0].toInt() * list[2].toInt()
        }
    }
}