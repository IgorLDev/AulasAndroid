package aula04_expressoes_condicionais.exercicios

private fun main() {
    println("Exercício 01")
    /*1-Elabore um código que verifique se o número é positivo, negativo ou zero */
    var numero = -8

    if (numero == 0) {
        println("O seu número é 0")
    } else if (numero > 0) {
        println("O seu número é positivo")
    } else {
        println("O seu número é negativo")
    }

    println("\nExercício 02")
    /*2-Elabore um código que declare a idade e mostre ao usuário se o indivíduo pode
     ou não tirar carta de motorista, bem como,
     se tiver a carta de motorista verifique se ele pode dirigir */
    var idade = 15
    var cartaDeMotorista = true

    if (idade >= 18) {
        println("Você cumpre o requisito de idade, portanto pode tirar a carta de motorista,")
        if (cartaDeMotorista == true) {
            print("e você pode dirigir, pois já possui a carta de motorista.")
        } else {
            print("porém você não pode dirigir, pois ainda não possui a carta de motorista.")
        }
    } else {
        println("Você não cumpre o requisito de idade, portanto não pode tirar a carta de motorista.")
    }

    println("\nExercício 03")
    /*Elabore um código que declare o dia de março e retorne o dia da semana
     Insira tratamento caso o número seja maior que 31 e menor que zero */

    val diaHoje = 26
    var resultado = diaHoje
    var diaSemana = 0

    if (diaHoje > 7) {
        do {
            diaSemana = resultado - 7
            resultado = diaSemana
        } while (diaSemana >= 7)
    }

    if (diaHoje <= 0) {
        println("Número informado inválido, digite um número positivo entre 1 á 31.")
    } else if (diaHoje >= 32) {
        println("Número informado inválido, digite um número entre 1 á 31.")
    } else {
        when (resultado) {
            1 -> println("$diaHoje - Sábado")
            2 -> println("$diaHoje - Domingo")
            3 -> println("$diaHoje - Segunda-Feira")
            4 -> println("$diaHoje - Terça-Feira")
            5 -> println("$diaHoje - Quarta-Feira")
            6 -> println("$diaHoje - Quinta-Feira")
            7 -> println("$diaHoje - Sexta-Feira")
        }
    }

    println("\nExercício 04")
    /* Elabore um código que declare o dia de março se a data é dia da semana ou final de semana
    Insira tratamento caso o número seja maior que 31 é menor que zero */

    if (diaHoje <= 0) {
        println("Número informado inválido, digite um número positivo entre 1 á 31.")
    } else if (diaHoje >= 32) {
        println("Número informado inválido, digite um número entre 1 á 31.")
    } else {
        when (resultado) {
            1 -> println("Dia $diaHoje é um fim de semana.")
            2 -> println("Dia $diaHoje é um fim de semana.")
            3 -> println("Dia $diaHoje é um dia de semana.")
            4 -> println("Dia $diaHoje é um dia de semana.")
            5 -> println("Dia $diaHoje é um dia de semana.")
            6 -> println("Dia $diaHoje é um dia de semana.")
            7 -> println("Dia $diaHoje é um dia de semana.")
        }
    }

    println("\nExercício 05")

    /* Elabore uma calculadora que o código que possua duas variáveis e obtenha um operador
     As operações devem ser soma, subtração, multiplicação e divisão
     Mostre os resultados */

    val userEscolha = 4
    val n1 = 2
    val n2 = 2

    println("""
        ------ Calculadora ------
        1 - Soma
        2 - Subtração
        3 - Multiplicação
        4 - Divisão
        -------------------------
    """.trimIndent())

    when (userEscolha) {
        1 -> println("O Resultado da soma é $n1+$n2=" + (n1 + n2))
        2 -> println("O Resultado da subtração é $n1-$n2=" + (n1 - n2))
        3 -> println("O Resultado da multiplicação é $n1*$n2=" + (n1 * n2))
        4 -> println("O Resultado da divisão é $n1/$n2=" + (n1 / n2))
    }

    println("\nExercício 06")
    /* Elabore um código que verifique se o número inserido no código está entre os intervalos 0 e 10, 11 e 20, 21 e 30,
    31 e 40, 41 e 50, 51 e 60, 61 e 70, 71 e 80, 81 e 90, 91 e 100
    Insira o tratamento caso o número seja menor que zero e maior que 100 */

    val numeroUsuario = 105

    if (numeroUsuario < 0) {
        println("O número informado [" + numeroUsuario + "] é um número menor que zero.")
    } else if (numeroUsuario > 100) {
        println("O número informado [" + numeroUsuario + "] é um número maior que cem.")
    } else if (numeroUsuario >= 0 && numeroUsuario <= 10) {
        println("O número informado [" + numeroUsuario + "] é um número igual ou está entre 0 e 10.")
    } else if (numeroUsuario >= 11 && numeroUsuario <= 20) {
        println("O número informado [" + numeroUsuario + "] é um número igual ou está entre 11 e 20.")
    } else if (numeroUsuario >= 21 && numeroUsuario <= 30) {
        println("O número informado [" + numeroUsuario + "] é um número igual ou está entre 21 e 30.")
    } else if (numeroUsuario >= 31 && numeroUsuario <= 40) {
        println("O número informado [" + numeroUsuario + "] é um número igual ou está entre 31 e 40.")
    } else if (numeroUsuario >= 41 && numeroUsuario <= 50) {
        println("O número informado [" + numeroUsuario + "] é um número igual ou está entre 41 e 50.")
    } else if (numeroUsuario >= 51 && numeroUsuario <= 60) {
        println("O número informado [" + numeroUsuario + "] é um número igual ou está entre 51 e 60.")
    } else if (numeroUsuario >= 61 && numeroUsuario <= 70) {
        println("O número informado [" + numeroUsuario + "] é um número igual ou está entre 61 e 70.")
    } else if (numeroUsuario >= 71 && numeroUsuario <= 80) {
        println("O número informado [" + numeroUsuario + "] é um número igual ou está entre 71 e 80.")
    } else if (numeroUsuario >= 81 && numeroUsuario <= 90) {
        println("O número informado [" + numeroUsuario + "] é um número igual ou está entre 81 e 90.")
    } else if (numeroUsuario >= 91 && numeroUsuario <= 100) {
        println("O número informado [" + numeroUsuario + "] é um número igual ou está entre 91 e 100.")
    } else {
        println("Informe um número válido.")
    }


}