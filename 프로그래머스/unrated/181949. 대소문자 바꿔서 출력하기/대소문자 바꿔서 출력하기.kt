fun main(args: Array<String>) {
    val s1 = readLine()!!
    var answer = ""
    for (i in s1) {
        if (i.isUpperCase()) {
            answer += i.toLowerCase()
        } else {
            answer += i.toUpperCase()
        }
    }
    print(answer)
}