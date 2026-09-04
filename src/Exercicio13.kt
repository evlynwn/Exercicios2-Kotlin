fun main() {

    val numeros =   (1 .. 100).toList()
    println(impar(numeros))

}
fun impar(numeros:List<Int>): List<Int>{
    return numeros.filter { it%2 != 0 }
}
