package aula06_classes.exemplos.ex02_classe_em_linha

class Animal(var nome: String, var tipo: String, var anoNascimento: Int)
class Tutor(var nome: String)

fun main() {
    val animal1 = Animal("Juju", "Cobra", 2020)
    val animal2 = Animal("Lulu", "Sapo", 2022)
    val tutor1 = Tutor("Ana")
    println(animal1.nome)
    println(animal2.tipo)
    println(tutor1.nome)
}