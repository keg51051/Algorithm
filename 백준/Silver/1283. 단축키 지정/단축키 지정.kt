import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val set = hashSetOf<Char>()

    loop@ for (i in 0..<n) {
        val command = br.readLine().split(" ").toMutableList()

        for (j in command.indices) {
            if (set.add(command[j][0].lowercaseChar())) {
                command[j] = "[${command[j][0]}]${command[j].substring(1)}"
                println(command.joinToString(" "))
                continue@loop
            }
        }

        for (j in command.indices) {
            for (k in command[j].indices) {
                if (set.add(command[j][k].lowercaseChar())) {
                    command[j] = "${command[j].substring(0..<k)}[${command[j][k]}]${command[j].substring(k+1)}"
                    println(command.joinToString(" "))
                    continue@loop
                }
            }
        }

        println(command.joinToString(" "))
    }
}