import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val balloons = MutableList(0) { mutableListOf<Int>() }
    var index = 0

    val values = br.readLine().split(" ").map { it.toInt() }

    repeat(n) {
        balloons.add(mutableListOf(it+1, values[it]))
    }

    repeat(n-1) {
        var value = balloons[index][1]
        print("${balloons[index][0]} ")
        balloons.removeAt(index)

        if (value > 0) value -= 1

        index = (index + value) % balloons.size

        if (index < 0) index += balloons.size
    }

    print(balloons[0][0])
}