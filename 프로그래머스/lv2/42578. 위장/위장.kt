class Solution {
    fun solution(clothes: Array<Array<String>>) = clothes
        .groupBy {it[1]}
        .values
        .fold(1) { a,b -> a * (b.size+1) }
        .minus(1)
}