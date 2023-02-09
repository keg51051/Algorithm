class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = IntArray(N)
        var size = stages.size
        
        val iMap = mutableMapOf<Int, Int>()
        val failureMap = mutableMapOf<Int, Double>()
        
        stages.forEach {
            when (iMap.containsKey(it)) {
                true -> iMap[it] = iMap.getValue(it) + 1
                false -> iMap[it] = 1
            }
        }
        
        for (i in 1..N) {
            when (iMap.containsKey(i)) {
                true -> {
                    failureMap[i] = (iMap.getValue(i) / size.toDouble())
                    size -= iMap.getValue(i)
                }
                false -> failureMap[i] = 0.0
            }
        }
        
        val list = failureMap.toList().sortedByDescending { it.second }
        
        for (i in 0 until N) {
            answer[i] = list[i].first
        }
        
        return answer
    }
}