package aula06_classes.exercicios.ex01_codigo_veterinario

import kotlin.math.roundToInt

class Animal(var nome: String, var especie: String, var idade: Int, var sexo: Char, var comidaFavorita: String) {
    fun exibirInfos() {
        println(
            "------INFOS: Seu Pet----- " +
            "\n Nome: $nome" +
            "\n Especie: $especie" +
            "\n Sexo: $sexo" +
            "\n Idade: $idade" +
            "\n Comida Favorita: $comidaFavorita" +
            "\n-------------------------")
    }

    fun emitirSom() {
        println("Som de $especie.")
    }

    fun comerComida() {
        println("$nome está comendo $comidaFavorita e está feliz por isso !!")
    }
}

class Veterinario(var nome: String, var rg: String, var cpf: String, var salario: Double = 1509.0) {
    fun exibirInfos() {
        println(
            "---INFOS: Profissional--- " +
            "\n Nome: $nome" +
            "\n RG: $rg" +
            "\n CPF: $cpf" +
            "\n Salário: $salario" +
            "\n-------------------------")
    }

    fun exibirAnimalAtribuido(veterinario: Veterinario, animal: Animal, codigoConsulta: String) {
        println("Profissional ${veterinario.nome} está cuidando de ${animal.nome}." +
                "\nCódigo da consulta: $codigoConsulta")
    }

    fun calcularAumento(veterinario: Veterinario){
        print("${veterinario.nome} recebe R$${veterinario.salario}" +
                "\nInforme em percentual, o aumento que deseja calcular: ")

        val aumentoPercentual = readln().toDouble()

        println("Você informou um percentual de ${aumentoPercentual.roundToInt()}%.\n" +
                "\nSalário Inicial: R$${veterinario.salario}" +
                "\nSalário Final: R$${(veterinario.salario+(veterinario.salario*(aumentoPercentual/100)))}" +
                "\n\nO aumento de ${aumentoPercentual.roundToInt()}% equivale a R$${(veterinario.salario*(aumentoPercentual/100))}")
    }
}

class Clinica(var nome: String,var cep: String, var rua: String, var numRua: Int, var municipio: String, var estado: String, var fundoDoacao: Double = 0.0) {
    fun exibirInfos() {
        println(
            "---------------INFOS: Clínica-----------" +
            "\n Clínica $nome" +
            "\n Rua: $rua | N: $numRua" +
            "\n Município: $municipio | Estado: $estado " +
            "\n CEP: $cep" +
            "\n----------------------------------------")
    }

    fun doarDinheiro(clinica: Clinica) {
        print("Digite quanto de dinheiro você deseja doar para a clínica ${clinica.nome}: ")
        clinica.fundoDoacao = readln().toDouble()
        println("Você doou uma quantia de R$$fundoDoacao." +
                "\nA Clínica ${clinica.nome} agradece," +
                "\ne os animaizinhos também !!")
    }

    fun exibirDoacao(clinica: Clinica) {
        println("A Clínica ${clinica.nome} tem um fundo de doações no valor total de R$${clinica.fundoDoacao}")
    }
}

fun main() {
    val animal1 = Animal("Tobias", "Cachorro", 5, 'M', "Ração")
    val animal2 = Animal("Luna", "Gato", 2, 'F', "Peixe")
    val animal3 = Animal("Nina", "Maritaca", 3, 'F', "Milho")

    val veterinario1 = Veterinario("Lucas Almeida", "123.456.789-12", "111.222.333-4")
    val veterinario2 = Veterinario("Amanda Cruz", "987.654.321-98", "222.333.444-5")

    val clinica1 = Clinica("Animais Felizes","00000-000","Rua Senador Joaquim", 233, "São Paulo", "SP")


    println("\n3 Métodos - Animal")
    println("\nMétodo Exibir Infos")
    animal3.exibirInfos()

    println("\nMétodo Emitir Som")
    animal3.emitirSom()

    println("\nMétodo Comer Comida")
    animal3.comerComida()

    println("\n3 Métodos - Veterinário")
    println("\nMétodo Exibir Infos")
    veterinario1.exibirInfos()

    println("\nMétodo Calcular Aumento")
    veterinario1.calcularAumento(veterinario1)

    println("\nMétodo Exibir Animal Atribuido")
    veterinario1.exibirAnimalAtribuido(veterinario1, animal2, "1s523K")

    println("\n3 Métodos - Clínica")
    println("\nMétodo Exibir Infos")
    clinica1.exibirInfos()

    println("\nMétodo Doar Dinheiro")
    clinica1.doarDinheiro(clinica1)

    println("\nMétodo Exibir Doação")
    clinica1.exibirDoacao(clinica1)
}