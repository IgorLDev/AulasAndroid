package aula05_lacos_e_repeticoes.exemplos

private fun main() {
    /* Exemplo 01 */
    println("Exemplo 01 - forma mais reduzida")
    listOf(0, 1, 2).forEach{println(it)}

    println("\nExemplo 02 - outra forma muito reduzida")
    var colecao = listOf(0, 1, 2)
    colecao.forEach{println(it)}

    println("\nExemplo 03 - forma tradicional")
    for (x in colecao){
        println(x)
    }

    println("\nExemplo 04 - outra forma tradicional")
    var i = 0;
    while (i < colecao.size) {
        println(colecao[i++])
    }

    /* Exemplo For */
    println("\nExemplo 01 - For")
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    println("\nExemplo 02 - For")
    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }

    /* Exemplo While e Do While */

    println("\nExemplo 01 - While")
    var n = 0
    while (n < 5) {
        println(n)
        n++
    }

    println("\nExemplo 02 - Do While")
    var m = 0
    do {
        println(m)
        m++
    }
    while (m < 5)
}