fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().split(" ").map { it.toInt() }[0]
    val list1 = arrayListOf<List<Int>>()
    val list2 = arrayListOf<List<Int>>()

    repeat(n) {
        list1.add(readLine().split(" ").map { it.toInt() })
    }

    repeat(n) {
        list2.add(readLine().split(" ").map { it.toInt() })
    }


    val answer = list1.zip(list2) { r1, r2 -> r1.zip(r2) { e1, e2 -> e1 + e2 }}

    for (i in answer) {
        println(i.joinToString(" "))
    }
}