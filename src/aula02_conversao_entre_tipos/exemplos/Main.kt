package aula02_conversao_entre_tipos.exemplos

import java.text.NumberFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter

private fun main() {

    println("Exemplo 1")
    val formataNumeros = NumberFormat.getNumberInstance().also{
        it.maximumFractionDigits = 2
        it.minimumFractionDigits = 2
    }

    val dividendos = formataNumeros.format(2543365)
    val valor = formataNumeros.parse(dividendos).toDouble()*0.9
    println(dividendos)
    println(valor)

    println("\nExemplo 2")

    val um ="1".toInt()
    val umPontoUm = "1.1".toDouble()

    val umComoString = 1.toString()
    val piComoString = "%,.2f".format(3.14159)

    println(um)
    println(umPontoUm)
    println(umComoString)
    println(piComoString)

    println("\nExemplo 3")

    val formataData = DateTimeFormatter.ofPattern("dd 'de' MMMM 'do ano de' YYYY")
    var data = LocalDate.of(2019, 1, 30)
    println(formataData.format(data))


}