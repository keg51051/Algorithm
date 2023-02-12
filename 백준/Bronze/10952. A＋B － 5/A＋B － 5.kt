fun main() {
    while (true) {
        val n = readln().split(" ")
        var a = n[0].toInt()
        var b = n[1].toInt()
        if(n == listOf("0","0")) break
        println(a+b)
    }
}