import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Scanner

val scanner = Scanner(System.`in`)
val idUsuario = 0
val nomeUsuario = "teste"
val salarioUsuario = 1509

fun main() {
    println("1. Cadastro de funcionários na empresa\n")

    exibirDataHoraAtual()
    menu()
    print("Digite a opção que deseja acessar: ")
    val userEscolha = scanner.nextInt()

    when (userEscolha) {
        1 -> cadastroUsuario()
        2 -> exibirUsuario()
        3 -> atualizarUsuario()
        4 -> deletarUsuario()
        5 -> print("Saindo do Sistema.")
        else -> print("Número digitado inválido.")
    }
}

fun exibirDataHoraAtual() {
    val data = LocalDate.now()
    val hora = LocalTime.now()

    val formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val formatadorHora = DateTimeFormatter.ofPattern("HH:mm:ss")

    val horaAtual = hora.format(formatadorHora)
    val dataAtual = data.format(formatadorData)

    println(" $dataAtual                                 $horaAtual")
}

fun menu() {
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
}

fun cadastroUsuario(){
    print("1. Cadastrar Funcionários")

}

fun exibirUsuario(){
    println("2. Exibir Funcionários")

}

fun atualizarUsuario(){
    println("3. Atualizar Funcionários")

}

fun deletarUsuario(){
    println("4. Deletar Funcionários")

}