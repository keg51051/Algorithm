import java.io.BufferedReader
import java.io.InputStreamReader

val tree = mutableMapOf<Char, MutableList<Char>>()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    repeat(n) {
        val (node, l, r) = br.readLine().split(" ").map { it.single() }
        tree[node] = mutableListOf(l, r)
    }

    preorder('A')
    println()
    inorder('A')
    println()
    postorder('A')

    br.close()
}

fun preorder(node: Char) {
    print(node)
    if (tree[node]!!.first() != '.') preorder(tree[node]!!.first())
    if (tree[node]!!.last() != '.') preorder(tree[node]!!.last())
}

fun inorder(node: Char) {
    if (tree[node]!!.first() != '.') inorder(tree[node]!!.first())
    print(node)
    if (tree[node]!!.last() != '.') inorder(tree[node]!!.last())
}

fun postorder(node: Char) {
    if (tree[node]!!.first() != '.') postorder(tree[node]!!.first())
    if (tree[node]!!.last() != '.') postorder(tree[node]!!.last())
    print(node)
}