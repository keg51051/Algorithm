fun main() {
    val arr = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var str = readln()

    for (i in arr) {
        str = str.replace(i, "a")
    }

    println(str.length)

}