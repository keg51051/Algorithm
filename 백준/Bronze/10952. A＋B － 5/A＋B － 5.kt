fun main() {
    while (true) {
        val n = readln().split(" ")
        if(n == listOf("0","0")) break
        println(n[0].toInt()+n[1].toInt())
    }
}