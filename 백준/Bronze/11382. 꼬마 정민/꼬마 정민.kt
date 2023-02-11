import java.math.BigDecimal

fun main() {
    var nums = readln().split(" ")
    var sum: BigDecimal = BigDecimal.ZERO
    for (i in 0 until nums.size) {
        sum += nums[i].toBigDecimal()
    }
    print(sum)
}