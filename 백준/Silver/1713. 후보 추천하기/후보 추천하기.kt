import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val rec = br.readLine().toInt()
    val vote = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(101) { Integer.MAX_VALUE }
    val frames = arrayListOf<Int>()

    for (v in vote) {
        if (frames.size < n) {
            if (frames.contains(v)) {
                arr[v] += 1
            } else {
                frames.add(v)
                arr[v] = 1
            }
        } else {
            val min = arr.min()

            if (frames.contains(v)) {
                arr[v] += 1
                continue
            } else {
                frames.add(v)
                arr[v] = 1
            }

            for (f in frames) {
                if (arr[f] == min) {
                    frames.remove(f)
                    arr[f] = Integer.MAX_VALUE
                    break
                }
            }
        }
    }

    print(frames.sorted().joinToString(" "))

}