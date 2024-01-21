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
    if (game1 >= 7 && setNumber == 3) return game1 == game2 + 2

    return false
}

fun main() {
    val (ime1, ime2) = readln().split(" ")
    val n = readln().toInt()

    repeat(n) {
        var ok = true
        val red = readln()
        var p = 0
        val pob = intArrayOf(0, 0)
        var kojiSet: Int
        var g1: Int
        var g2: Int
        var ucitano: Int

        for (kojiSet in 1..red.count { it == ':' }) {
            val result = Regex("""(\d+:\d+)""").find(red.substring(p))
            if (result != null) {
                val (score, _) = result.destructured
                val scores = score.split(":")
                g1 = scores[0].toInt()
                g2 = scores[1].toInt()
                p += score.length
                ok = ok && pob[0] < 2 && pob[1] < 2 && checkOneSet(g1, g2, kojiSet, ime1, ime2, pob)
            } else {
                break
            }
        }

        ok = ok && (pob[0] == 2 || pob[1] == 2)
        println(if (ok) "da" else "ne")
    }
}


