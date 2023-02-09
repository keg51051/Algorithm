class Solution {
    fun solution(s: String): Int {
        val length = s.length
        var min = length
        val mid = length/2+1
        for (cnt in 1 until mid+1) {
            var len = length
            var i =cnt
            var num = 1

            while (i<length-cnt+1) {
                val word =s.substring(i, i+cnt)
                val word2 =s.substring(i-cnt,i)
                if(word==word2) {
                    num++
                    len-=cnt
                } else {
                    if (num!=1) {
                        len+= num.toString().length
                        num=1
                    }
                }
                i+=cnt

                if (i>=length-cnt+1 &&num!=1) {
                    len+= num.toString().length
                }
            }
            if (min>len) {
                min =len
            }
        }
        return min
    }
}