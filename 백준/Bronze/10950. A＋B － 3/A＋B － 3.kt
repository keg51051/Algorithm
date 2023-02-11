fun main() {
    val n = readln().toInt()
    var a=0
    var b=0
    var nums: List<String>
    var sums: ArrayList<Int> = arrayListOf()

    for(i in 0 until n) {
        nums = readln().split(" ")
        a = nums[0].toInt()
        b = nums[1].toInt()
        sums.add(a+b)
    }

    for (i in 0 until n) {
        println(sums[i])
    }
}