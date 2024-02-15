import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val tc = br.readLine().toInt() // 테스트 케이스 수


    repeat(tc) {
        run repeatBlock@{
            val function = br.readLine().replace("RR", "") // 함수 ex) RDD
            val size = br.readLine().toInt() // 배열의 크기
            val input = br.readLine() // ex) [1,2,3] => String
            if (input == "[]" && function.contains('D')) {
                println("error")
                return@repeatBlock
            } else {
                if (input == "[]") {
                    println("[]")
                    return@repeatBlock
                }
                val arr = input.substring(1, input.length - 1).split(",").map { it.toInt() }
                var reversed = false
                var start = 0
                var end = arr.size

                for (f in function) {
                    if (f == 'R') {
                        reversed = !reversed
                    } else if (f == 'D') {
                        if (end <= start) {
                            println("error")
                            return@repeatBlock
                        }
                        if (reversed) {
                            end -= 1
                        } else {
                            start += 1
                        }

                    }
                }
                if (reversed) {
                    println(arr.subList(start, end).reversed().toString().replace(", ", ","))
                } else {
                    println(arr.subList(start, end).toString().replace(", ", ","))
                }
            }
        }
    }
}