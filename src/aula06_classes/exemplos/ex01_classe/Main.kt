package aula06_classes.exemplos.ex01_classe

class Animal {
    var nome = ""
    var tipo = ""
    var anoNascimento = 0
}

class Tutor {
    var nome = ""
}

fun main() {
    val animal1 = Animal()
    animal1.nome = "Juju"
    animal1.tipo = "Cobra"
    animal1.anoNascimento = 2020

    val animal2 = Animal()
    animal2.nome = "Lulu"
    animal2.tipo = "Sapo"
    animal2.anoNascimento = 1969

    val tutor1 = Tutor()
    tutor1.nome = "Ana"

    println(animal1.nome)
    println(animal1.tipo)
    println(tutor1.nome)
}