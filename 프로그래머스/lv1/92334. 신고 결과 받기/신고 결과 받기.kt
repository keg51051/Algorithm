class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var report = report.distinct()
        var answer = ArrayList<Int>()
        var map = LinkedHashMap<String, Int>()
        var repMap = HashMap<String, ArrayList<String>>()
        
        id_list.forEach {
            map.put(it, 0)
        }
        
        report.forEachIndexed { i, it ->
            var arrRep = report[i].split(" ")
            var reporter = arrRep[0]
            var reported = arrRep[1]
            
            if (repMap.containsKey(reported)) {
                repMap.get(reported)?.add(reporter)
            } else {
                var list = ArrayList<String>()
                list.add(reporter)
                repMap.put(reported, list)
            }
        }
        
        for (key in repMap.keys) {
            var rep = repMap.get(key)
            if (rep!!.size >= k) {
                for (i in rep) {
                    map.put(i, map.getOrDefault(i, 0) + 1)
                }
            }
        }
        
        for (key in map.keys) {
            var answerKey = map.get(key)
            if (answerKey != null) {
                answer.add(answerKey)
            }
        }
        
        return answer.toIntArray()
    }
}