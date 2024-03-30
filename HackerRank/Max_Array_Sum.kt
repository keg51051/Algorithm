import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the maxSubsetSum function below.
fun maxSubsetSum(arr: Array<Int>): Int {
    val dp = IntArray(arr.size)
    
    dp[0] = arr[0]
    dp[1] = maxOf(arr[0], arr[1])
    
    for (i in 2 until arr.size) {
        dp[i] = maxOf(arr[i], arr[i] + dp[i-2], dp[i-1])
    }
    
    return if (dp.last() > 0) dp.last() else 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val res = maxSubsetSum(arr)

    println(res)
}
