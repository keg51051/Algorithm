class Solution {
    fun solution(polynomial: String): String {
        var answer: String = ""
        var arr = polynomial.split(" ")
        var xSum = 0
        var sum = 0
        
        for (i in arr) {
            if (i.contains("x")) {
                if (i == "x") {
                    xSum += 1
                } else {
                    if (i.length == 2) {
                        xSum += Character.getNumericValue(i[0])
                    } else {
                        xSum += Character.getNumericValue(i[0])*10 + Character.getNumericValue(i[1])
                    }
                }
            } else if (i != "+"){
                sum += i.toInt()
            }
        }
        
        if (xSum == 0) {
            answer = sum.toString()
        } else if (sum == 0) {
            if (xSum != 1) {
                answer = xSum.toString() + "x"
            } else {
                answer = "x"
            }
        } else {
            if (xSum != 1) {
                answer = xSum.toString() + "x + " + sum.toString()
            } else {
                answer = "x + " + sum.toString()
            }
        }
        
        return answer
    }
}