import java.util.TreeMap
class Solution {
    var pTime = 0
    var pCost = 0
    var aTime = 0
    var aCost = 0
    
    fun calCost(t: Int): Int {
        var cost = pCost
        var time = t
        time -= pTime
        if(time > 0) {
            var overTime = if(time % aTime==0) {
                time/aTime
            } else {
                time/aTime+1
            }
            cost += overTime*aCost
        }
        return cost
    }
    
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        
        var map = mutableMapOf<String, Int>()
        var totalTime = TreeMap<String, Int>()
        
        pTime = fees[0]
        pCost = fees[1]
        aTime = fees[2]
        aCost = fees[3]
        
        for (record in records) {
            val (time, car, action) = record.split(' ')
            var t = 0
            
            time.split(':').map { it.toInt() }.apply {
                t += this[0]*60 + this[1]
            }
            
            if (action == "IN") map[car] = t
            else {
                totalTime[car] = totalTime.getOrDefault(car, 0) + t - map[car]!!
                map.remove(car)
            }
        }
        
        map.forEach {car, t ->
            totalTime[car] = totalTime.getOrDefault(car, 0) + (23*60 + 59) - t
        }
        
        var answer = IntArray(totalTime.size)
        var idx = 0
        
        totalTime.forEach { vehicle, i ->
            answer[idx++] = calCost(i)
        }
        
        return answer
    }
    
    
}