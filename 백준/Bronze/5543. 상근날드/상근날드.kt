fun main() {
    var burgers = arrayListOf<Int>()
    var drinks = arrayListOf<Int>()

    repeat(3) {
        burgers.add(readln().toInt())
    }
    repeat(2) {
        drinks.add(readln().toInt())
    }

    println(burgers.min() + drinks.min() - 50)
}
