import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val reg = "(w+o+l+f+)+"
    var w = 0
    var o = 0
    var l = 0
    var f = 0
    var check = false

    for (i in input.indices) {
        when (input[i]) {
            'w' -> w += 1
            'o' -> o += 1
            'l' -> l += 1
            'f' -> f += 1
        }

        if (i < input.length - 1 && input[i] == 'f' && input[i + 1] == 'w') {
            if (!(w == o && o == l && l == f && f == w)) {
                check = true
                break
            }
        }
    }

    if (!check && input.matches(reg.toRegex()) && w == o && o == l && l == f && f == w) {
        print(1)
    } else {
        print(0)
    }

    br.close()
}