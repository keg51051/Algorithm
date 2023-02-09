class Solution {
    fun solution(p: String): String {
        if (p.length == 0) return ""
        
        val sb = StringBuilder()
        
        var balanceNum = 0
        var divideIndex = 0
        
        for (currentIndex in 0..p.length-1) {
            if (p[currentIndex] == '(') {
                balanceNum += 1
            } else {
                balanceNum -= 1
            }
            if (balanceNum == 0) {
                divideIndex = currentIndex
                break
            }
        }
        
        val u = p.substring(0, divideIndex+1)
        val v = p.substring(divideIndex+1)
            
        if (u[0] == '(') {
            sb.append(u)
            sb.append(solution(v))
        } else {
            sb.append('(')
            sb.append(solution(v))
            sb.append(')')
            u.substring(1, u.length-1).forEach {
                sb.append(
                if (it == '(') {
                    ")"
                } else {
                    "("
                })
            }
        }
        return sb.toString()
    }
}