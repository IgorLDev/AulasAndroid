package aula07_orientacao_a_objeto.exercicios.farmacia

class Funcionario(val nome: String, val cargo: String, val anoNasc: String, val CPF: String, val salario: Double, val id: Int) {
    fun exibirFuncionarios(){
        println("------- Funcionário ------- " +
                "\nNome: $nome" +
                "\nID: $id" +
                "\nCargo: $cargo" +
                "\nNascimento $anoNasc" +
                "\nCPF: $CPF" +
                "\nSalário: $salario")
    }

    fun registrarVenda(quantidadeVendida: Int, medicamento: Medicamento){
        println("Funcionário $nome cargo: $cargo registrando venda $quantidadeVendida unidade(s) de ${medicamento.nome}")
        medicamento.atualizarEstoque(quantidadeVendida)
    }

    fun atualizarSalario(novoSalario:Double){
        println("Atualizando salário de $nome")
    }
}

class Medicamento(val nome: String, val preco: Double, val quantidadeEstoque : Int){
    fun exibirMedicamentos(){
        println("------- Medicamento ------- " +
                "\nNome: " + nome +
                "\nPreço: R$" + preco +
                "\nQuantidade: " + quantidadeEstoque + " U")
    }

    fun verificarEstoque(quantidadeDesejada: Int) : Boolean{
        if (quantidadeDesejada <= quantidadeEstoque) {
            println("Existem $quantidadeEstoque de $nome")
            return true
        } else {
            println("Não há produtos suficiente no estoque.")
            return false
        }
    }

    fun atualizarEstoque(quantidadeVendida: Int){
        if (quantidadeVendida <= quantidadeEstoque){
            println("Vendendo $quantidadeVendida unidade(s) de $nome")
            val novoEstoque = quantidadeEstoque - quantidadeVendida
        } else {
            println("Não há estoque suficiente para realizar a venda")
        }
    }
}

class Pedido(val nomeCliente : String, val codPedido: String, val medicamento: Medicamento, val funcionario: Funcionario){
    fun exibirPedidos(){
        println("------- Pedido -------" +
                "\nCliente: " + nomeCliente +
                "\nCódigo: " + codPedido +
                "\nRémedio: " + medicamento.nome +
                "\nPreço: " + (medicamento.quantidadeEstoque * medicamento.preco) +
                "\nQuantidade: " + medicamento.quantidadeEstoque + "U" +
                "\nVenda realizada por: " + funcionario.nome)
    }
}

fun main(){

    val funcionario1 = Funcionario("Fabricio","Farmaceuta","26/07/1998", "111222333-44", 2100.0, 1)
    val medicamento1 = Medicamento("dipirona", 10.52, 50)
    val pedido1 = Pedido("Maria", "11JKd85l", medicamento1, funcionario1)

    funcionario1.exibirFuncionarios()
    println()
    medicamento1.exibirMedicamentos()
    println()
    pedido1.exibirPedidos()

    funcionario1.registrarVenda(20, medicamento1)
}