package aula05_lacos_e_repeticoes.exercicios

import aula01_tipos_de_dados.exercicios.userEscolha
import kotlin.random.Random

fun main() {
    println("Exercício 01" +
            "\nElabore um código que imprima todos os números pares de 0 a 100")

    println("\nUtilizando o For")
    for (num in 0..100 step 2) {
        print("$num, ")
    }
    /* Utilizamos o '..' para números crescentes e 'downTo' para números decrescentes */

    println("\nUtilizando o Do")
    var numerosPares = 0

    do {
        print("$numerosPares, ")
        numerosPares += 2
    } while (numerosPares < 101)

    println("\n\nExercício 02" +
            "\nElabore um jogo que solicite ao usuário números de 1 a 100" +
            "\n* O jogo deve solicitar um número ao usuário" +
            "\n* O número inserido deve ser comparado a um valor" +
            "\n* O valor deve ser inserido no código e deve ser adivinhado pelo usuário" +
            "\n* Insira o tratamento de erro para números que sejam menor que 1 e maior que 100"
    )


    val numSortido = Random.nextInt(0, 101)
    println("\nDev Function Log: O valor do número sorteado é [$numSortido].")
    print("\nUsuário informe um número entre 1 á 100: ")
    var input = readln().toInt()
    var contagem = 1

    if (input == numSortido) {
        println("\nParábens você informou o número [$input] e acertou !!\nVocê acertou de primeira, parabéns.")
    } else {
        do {
            contagem++
            print("Número informado [$input] incorreto, tente novamente: ")
            input = readln().toInt()
            if (input !in 1..100) {
                println("Número informado [$input] inválido, digite um número entre 1 á 100: ")
                input = readln().toInt()
            } else if (input == numSortido) {
                println("\nParábens você informou o número [$input] e acertou !!\nVocê teve um total de tentativas de $contagem vezes.")
            }
        } while (input != numSortido)
    }

    println("\nExercício 03" +
            "\nElabore um programa que cadastre o nome e a senha do usuário" +
            "\n* Após o cadastro, o programa solicita novamente nome e senha do usuário" +
            "\n* Caso o nome e/ou a senha sejam compatíveis, o usuário recebe a mensagem “Autenticação realizada com sucesso!”" +
            "\n* Caso o nome e/ou a senha sejam incompatíveis, o usuário recebe a mensagem “Acesso negado! Dados incorretos.”" +
            "\n* Caso o usuário digite 3 vezes os dados incorretos , o usuário recebe a mensagem “Usuário bloqueado!”")

    var tentativas = 0
    println("\nDigite o nome do Usuário: ")
    var login = readln().toString()
    val loginAutenticado = login
    println("Digite sua senha: ")
    var senha = readln().toInt()
    val senhaAutenticada = senha

    do {
        tentativas++
        println("Digite novamente o nome do Usuário: ")
        login = readln().toString()
        println("Digite novamente a sua senha: ")
        senha = readln().toInt()

        if (login == loginAutenticado && senha == senhaAutenticada) {
            println("Autenticação realizada com sucesso!")
            return
        } else if (tentativas == 3) {
            println("Usuário bloqueado!")
        } else {
            println("Acesso negado! Dados incorretos.")
        }
    } while (tentativas != 3)

    println("\nExercício 04" +
            "\nElabore um jogo da velha")

//    // userChoice = readln().toInt()
//
//
//    //Linhas
//    val linha1 = arrayOf(1,2,3)
//    val linha2 = arrayOf(4,5,6)
//    val linha3 = arrayOf(7,8,9)
//
//    //Colunas
//    val coluna1 = arrayOf(1,4,7)
//    val coluna2 = arrayOf(2,5,8)
//    val coluna3 = arrayOf(3,6,9)
//
//    //Diagonais
//    val diagonal1 = arrayOf(1,5,9)
//    val diagonal2 = arrayOf(3,5,7)
//
//    val userArray = arrayOf(userEscolha)




}

