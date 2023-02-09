import java.util.*
class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        
        val pq = PriorityQueue<Int>(reverseOrder()).apply{ priorities.map(::offer) }
        println(pq)
        
        while(pq.isNotEmpty()){ 
            for(i in priorities.indices){ 
                if(pq.peek() == priorities[i]){ 
                    pq.poll() 
                    answer++ 
                    if(i == location){ 
                        pq.clear() 
                        break 
                    } 
                } 
            } 
        }
        return answer
    }
}