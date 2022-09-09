class ContaPoupanca(
    titular: String,
    numero: Int,
) : ContaX(
    titular,
    numero,
),Transferir {


    override fun saca(valor: Double) {
        if (saldo >= valor){
            saldo -= valor
        }
    }

}