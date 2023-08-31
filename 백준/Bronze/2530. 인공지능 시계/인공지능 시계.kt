import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var (h, m, s) = br.readLine().split(" ").map { it.toInt() }
    val sec = br.readLine().toInt()

    h = (h + ((m + ((s + sec) / 60)) / 60)) % 24
    
    m = (m + ((s + sec) / 60)) % 60

    s = (s + sec) % 60
    

    print("$h $m $s")

    br.close()
}