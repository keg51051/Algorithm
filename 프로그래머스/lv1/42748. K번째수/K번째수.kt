class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)
        for(i in 0 until answer.size) { 
            var temp = array.copyOfRange(commands[i][0]-1, commands[i][1]) 
            temp.sort()
            answer[i] = temp[commands[i][2]-1]
        }
        return answer
    }
}