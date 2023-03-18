import java.util.PriorityQueue

class Solution {
    fun solution(operations: Array<String>): IntArray {
        var answer = intArrayOf()
        var pq = PriorityQueue<Int>()
        var pq2 = PriorityQueue<Int> { a,b -> b.compareTo(a) }
        for (i in operations) {
            var tmp = i.split(" ")
            if (tmp[0] == "I") {
                pq.add(tmp[1].toInt())
                pq2.add(tmp[1].toInt())
            } else {
                if(pq.isEmpty())
                else if (tmp[1] == "1") {
                    pq.remove(pq2.poll())
                } else {
                    pq2.remove(pq.poll())
                }
            }
        }
        
        if (pq.isEmpty()) {
            repeat(2) {
                answer += 0
            }
        } else {
            answer += pq2.peek()
            answer += pq.peek()
        }
        return answer
    }
}