package aula01_tipos_de_dados.exercicios

import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Scanner

val scanner = Scanner(System.`in`)
var userEscolha = 0
var idUsuario = userEscolha
var nomeUsuario = "teste"
var salarioUsuario = 1509

var listaIDs = arrayListOf(idUsuario)
var listaNomes = arrayListOf(nomeUsuario)
var listaSalario = arrayListOf(salarioUsuario)
var listaFuncionarios = arrayListOf(listaIDs[idUsuario], listaNomes[idUsuario], listaSalario[idUsuario])

fun main() {
    println("1. Cadastro de funcionários na empresa")

    menu()

}

fun exibirDataHoraAtual() {
val data = LocalDate.now()
val hora = LocalTime.now()

val formatadorData = DateTimeFormatter.ofPattern("'BRASIL:' dd 'de' MMMM 'de' yyyy")
val formatadorHora = DateTimeFormatter.ofPattern("'às' HH:mm:ss '(GMT-3)'")

val horaAtual = hora.format(formatadorHora)
val dataAtual = data.format(formatadorData)

    println("\n $dataAtual $horaAtual")
}
fun menu() {
    exibirDataHoraAtual()
    print("""
         ------- Sistema de Cadastro de Funcionários -------
            1. Cadastrar Funcionários
            2. Exibir Funcionários
            3. Atualizar Funcionários
            4. Deletar Funcionários
            5. Sair do Sistema
        ----------------------------------------------------
    """.trimIndent())
    println("\n")

    print("Digite a opção que deseja acessar: ")
    userEscolha = scanner.nextInt()

    when (userEscolha) {
        1 -> cadastroUsuario()
        2 -> exibirUsuario()
        3 -> atualizarUsuario()
        4 -> deletarUsuario()
        5 -> print("Saindo do Sistema.")
        else -> print("Número digitado inválido.\nOcorreu um erro finalizando sistema.")
    }
}

fun cadastroUsuario(){
    println("1. Cadastrar Funcionários")
    println("Digite o nome do Funcionário do ID [${idUsuario +1}]")
    nomeUsuario = scanner.nextLine()
    scanner.nextLine()
    listaNomes.add(nomeUsuario)
    println("Digite o salário do Funcionário")
    salarioUsuario = scanner.nextInt()

    return menu()

}

fun exibirUsuario(){
    println("2. Exibir Funcionários")
    print("Digite o ID do Funcionário que deseja acessar as informações: ")
    userEscolha = scanner.nextInt()
    println("ID |  Nome Funcionário  | Salário")

    return menu()

}

fun atualizarUsuario(){
    println("3. Atualizar Funcionários")

    return menu()

}

fun deletarUsuario(){
    println("4. Deletar Funcionários")

    return menu()

}



