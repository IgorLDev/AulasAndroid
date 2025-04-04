package aula07_orientacao_a_objeto.exercicios.banco

abstract class Conta(val numero: Int, val titular: String, var saldo: Double){
    abstract fun sacar(valor: Double)
    abstract fun depositar(valor: Double)

    fun consultarSaldo() {
        println("Saldo: R$${"%.2f".format(saldo)}")
    }
}

class ContaCorrente(numero: Int, titular: String, saldo: Double) : Conta(numero, titular, saldo){
    override fun sacar(valor: Double) {
        if (valor > saldo) {
            println("Saque de R$${"%.2f".format(valor)} não efetuado, saldo insuficiente.")
        } else {
            saldo -= valor
            println("Saque realizado com sucesso, saldo atual R$${"%.2f".format(saldo)}.")
        }
    }

    override fun depositar(valor: Double) {
        println("Deposito de R$${"%.2f".format(valor)} efetuado com sucesso." +
                "\nSaldo anterior: R$${"%.2f".format(saldo)}")
        saldo += valor
        println("Saldo atual: R$$saldo")
    }
}

class ContaPoupanca(numero: Int, titular: String, saldo: Double) : Conta(numero, titular, saldo){
    override fun sacar(valor: Double) {
        println("Saque Conta Poupança")
    }

    override fun depositar(valor: Double) {
        println("Deposito de R$${"%.2f".format(valor)} efetuado com sucesso." +
                "\nSaldo anterior: R$${"%.2f".format(saldo)}")
        saldo += valor
        println("Saldo atual: R$${"%.2f".format(saldo)}")
    }

    fun aplicarRendimento(taxa: Double){
        if (taxa > 0.0) {
        println("Rendimento de ${"%.0f".format(taxa)}%" +
                "\nSaldo anterior: R$${"%.2f".format(saldo)}")
        saldo += (saldo *(taxa/100))
            println("Saldo atual: R$${"%.2f".format(saldo)}")
        } else {
            println("Aplicação de rendimento falhou, insira uma taxa acima de 0%.")
        }

    }
}

fun main(){
    val contaPoupanca = ContaPoupanca(120322, "Igor", 10000.0)
    val contaCorrente = ContaCorrente(155522, "teste", 500.0)

    println("------------------ Conta Poupanca ----------------")
    println("NºConta: " + contaPoupanca.numero)
    println("Titular: " + contaPoupanca.titular)
    contaPoupanca.consultarSaldo()

    println("----------- Metódos: Conta Poupanca --------------")
    contaPoupanca.sacar(1000.0)
    contaPoupanca.depositar(10000.0)
    contaPoupanca.aplicarRendimento(-1.0)
    contaPoupanca.aplicarRendimento(100.0)

    println("------------------ Conta Corrente ----------------")
    println("NºConta: " + contaCorrente.numero)
    println("Titular: " + contaCorrente.titular)
    contaCorrente.consultarSaldo()

    println("----------- Metódos: Conta Corrente -------------")
    contaCorrente.sacar(100.0)
    contaCorrente.depositar(100.0)
    contaCorrente.consultarSaldo()
    contaCorrente.sacar(50.0)
    contaCorrente.consultarSaldo()

}

