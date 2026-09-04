fun main() {
    val idade = listOf(1,18,9,20,22,21)
        .filter { it >= 18 }

    val mediaMaiores = (idade.sum()) / idade.size

    println(mediaMaiores)
}
