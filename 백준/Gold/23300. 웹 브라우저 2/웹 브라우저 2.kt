import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var backward = ArrayList<Int>()
    val backwardDistinct = ArrayList<Int>()
    val forward = ArrayList<Int>()
    var current = 0

    val (n, q) = br.readLine().split(" ").map { it.toInt() }

    repeat(q) {
        val command = br.readLine().split(" ")

        when (command[0]) {
            "B" -> if (backward.isNotEmpty()) {
                forward.add(current)
                current = backward.removeLast()
            }

            "F" -> if (forward.isNotEmpty()) {
                backward.add(current)
                current = forward.removeLast()
            }

            "C" -> {
                var j = 1
                while (j < backward.size) {
                    if (backward[j - 1] == backward[j]) {
                        backward.removeAt(j--)
                    }
                    j++
                }
            }

            "A" -> {
                if (current != 0) {
                    backward.add(current)
                    forward.clear()
                    current = command[1].toInt()
                } else {
                    current = command[1].toInt()
                }
            }
        }
    }

    println(current)

    if (backward.isNotEmpty()) {
        println(backward.reversed().joinToString(" "))
    } else {
        println(-1)
    }

    if (forward.isNotEmpty()) println(forward.reversed().joinToString(" ")) else println(-1)

}