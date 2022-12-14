class ContaCorrente(
    titular: String,
    numero: Int,
) : ContaX(
    titular,
    numero
), Transferir {
    override fun saca(valor: Double) {
        val valorTaxa = valor + 0.1
        if (this.saldo >= valorTaxa){
            this.saldo -= valorTaxa
        }
    }
}