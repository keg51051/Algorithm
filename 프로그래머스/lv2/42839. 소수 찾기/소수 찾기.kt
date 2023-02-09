class Solution {
    fun solution(numbers: String): Int {
        var answer = 0
        val numSet = HashSet<Int>() 
        makeNumberSet("", numbers, numSet) 
        while(numSet.iterator().hasNext()) { 
            val num = numSet.iterator().next() 
            numSet.remove(num) 
            if(isPrime(num)) answer++ 
        }
        return answer
    }
    
    fun makeNumberSet(prefix:String, numbers:String, numSet:HashSet<Int>){ 
        if(prefix != "") numSet.add(prefix.toInt()) 
        for(i in numbers.indices){ 
            makeNumberSet("$prefix${numbers[i]}", numbers.substring(0, i) + numbers.substring(i+1), numSet) 
        } 
    }

    fun isPrime(number: Int): Boolean {
        if (number == 1 || number == 0) {
            return false
        }
        for (i in (2..(number / 2))) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }
}