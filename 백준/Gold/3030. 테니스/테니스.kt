import java.io.BufferedReader
import java.io.InputStreamReader

fun checkOneSet(
    g1: Int,
    g2: Int,
    setNumber: Int,
    name1: String,
    name2: String,
    wins: IntArray
): Boolean {
    var game1 = g1
    var game2 = g2
    var n2 = name2
    if (g1 == g2) return false

    if (g1 < g2) {
        game1 = g2
        game2 = g1
        n2 = name1
        wins[1]++
    } else {
        wins[0]++
    }

    if (n2 == "federer") return false

    if (game1 < 6) return false
    if (game1 == 6) return game2 <= 4
    if (game1 == 7 && setNumber < 3) return game2 == 5 || game2 == 6
    if (setNumber == 3) return game1 == game2 + 2

    return false
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (ime1, ime2) = br.readLine().split(" ")
    val n = br.readLine().toInt()

    repeat(n) {
        var ok = true
        val games = br.readLine().split(" ")
        val pob = intArrayOf(0, 0)

        for (i in games.indices) {
            val game = games[i]
            val (g1, g2) = game.split(":").map { it.toInt() }
            ok = ok && pob[0] < 2 && pob[1] < 2 && checkOneSet(g1, g2, i+1, ime1, ime2, pob)
        }

        ok = ok && (pob[0] == 2 || pob[1] == 2)
        println(if (ok) "da" else "ne")
    }
}