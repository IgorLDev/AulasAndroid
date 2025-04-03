package aula07_orientacao_a_objeto.exercicios.concessionaria

import com.sun.tools.javac.Main

class Carro(val marca: String, val modelo: String, val cor: String, val ano : Int, val quilometragem: Int, val preco : Double) {
    fun exibirInfos() {
        println(
            "------- Infos Carro -------" +
                    "\nMarca: $marca" +
                    "\nModelo: $modelo" +
                    "\nCor: $cor" +
                    "\nAno: $ano" +
                    "\nQuilometragem: $quilometragem" +
                    "\nPreço: $preco"
        )
    }

    fun vender(quantidade: Int) {
        println("Vendendo $quantidade unidade(s) de $modelo por R$" + (preco * quantidade))
    }
}

class Vendedor(val nome: String, val idFuncionario: Int, val CPF: String, val email: String, val telefone: String, val salario: Double){
    fun exibirInfos(){
        println("Vendedor" +
                "\nNome: $nome" +
                "\nId: $idFuncionario" +
                "\nCPF: $CPF" +
                "\nE-mail: $email" +
                "\nTelefone: $telefone" +
                "\nSalário: $salario")
    }

    fun registrarVenda(cliente: Cliente, carro: Carro, quantidade: Int){
        println("Venda registrada por $nome")
        cliente.comprar(carro, quantidade)
    }

}

class Cliente(val nome: String, val idCliente: Int, val CPF: String, val email: String, val telefone: String, val dinheiroConta: Double){
    fun exibirInfos(){
        println("Vendedor" +
                "\nNome: $nome" +
                "\nId: $idCliente" +
                "\nCPF: $CPF" +
                "\nE-mail: $email" +
                "\nTelefone: $telefone" +
                "\nSalário: $dinheiroConta")
    }

    fun comprar(carro: Carro, quantidade: Int){
        println("$nome comprou $quantidade unidade(s) de ${carro.modelo}")
        carro.vender(quantidade)
    }
}

fun main(){
    val fusca = Carro("Ford", "Fusca", "Azul", 1850, 1622, 20000.0)
    val cliente1 = Cliente("Carlos Silva", 1, "111.222.333-10", "carlosilva@gmail.com", "1111-2222", 500000.0)
    val vendedor1 = Vendedor("Ana", 1, "999888777-66", "ana@gmail.com", "9999-8888", 2500.0)

    vendedor1.registrarVenda(cliente1, fusca,3)

}