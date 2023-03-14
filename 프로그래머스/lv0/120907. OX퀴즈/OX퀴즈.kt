class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for (i in quiz) {
            val arr = i.split(" ")
            if (arr[1] == "+" && arr[0].toInt() + arr[2].toInt() == arr[arr.size-1].toInt()) {
                answer += "O"
            } else if (arr[0].toInt() - arr[2].toInt() == arr[arr.size-1].toInt()) {
                answer += "O"
            } else {
                answer += "X"
            }
        }
        return answer
    }
}

