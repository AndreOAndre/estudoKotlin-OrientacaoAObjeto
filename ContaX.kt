abstract class ContaX(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) , Transferir {
    override fun transfere(destino: ContaX, valor: Double) {
        if (saldo >= valor) {
            println("seu saldo antes: ${destino.saldo} reais")
            saldo -= valor
            destino.saldo += valor
            println("seu saldo agora: ${destino.saldo} Reais")
        } else println("falha na transferencia")
    }
}