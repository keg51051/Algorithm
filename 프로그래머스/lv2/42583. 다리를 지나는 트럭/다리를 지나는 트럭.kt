import java.util.*

class Solution {
fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
    var answer = 0

    val onBridge : Queue<Int> = LinkedList<Int>()
    val waitQueue : Queue<Int> = LinkedList<Int>()

    for(i in 0 until bridge_length) {
        onBridge.add(0)
    }
    
    for(i in truck_weights) {
        waitQueue.add(i)
    }

    while(onBridge.isNotEmpty()){
        answer++
        onBridge.poll()
        if(waitQueue.isNotEmpty()) {
                if (onBridge.sum() <= weight - waitQueue.peek()) {
                    onBridge.add(waitQueue.poll())
                } else {
                    onBridge.add(0)
                }
            }
        }
        return answer
}
}