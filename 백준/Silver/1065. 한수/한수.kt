import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var num = br.readLine()
    var answer = 0

    if (num.toInt() <= 99) {
        answer = num.toInt();
    } else if (num.toInt() == 1000) {
        answer = 144
    } else {
        answer = 99
        for (i in 100..num.toInt()) {
            val temp = i.toString().map { it.toString().toInt() }
            if (temp[1]-temp[0] == temp[2]-temp[1]) {
                answer += 1
            }
        }
    }

    println(answer)


    br.close()
    bw.close()
}