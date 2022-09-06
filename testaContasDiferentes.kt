fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "fran",
        numero = 1001
    )

    println("TESTA DEPOSITANDO")
    println()
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")
    //--------------------------------------------------//
    println()
    println()
    //--------------------------------------------------//
    println("TESTA SAQUE MODIFICADO - HERANÇA")
    println()
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    println("saquer apos saque: ${contaCorrente.saldo}")
    println("saquer apos saque: ${contaPoupanca.saldo}")
    //--------------------------------------------------//
    println()
    println()
    //--------------------------------------------------//
    println("TESTA TRANSFERENCIA")
    println()

    contaCorrente.transfere(valor = 100.0, destino = contaPoupanca)

    println("saldo conta corrente após transferir para conta poupança: ${contaCorrente.saldo}")
    println("saldo conta poupança após receber transferencia: ${contaPoupanca.saldo}")
    println()

    contaPoupanca.transfere(valor = 100.0, destino = contaCorrente)

    println("saldo conta poupança após transferir para conta corrente: ${contaPoupanca.saldo}")
    println("saldo conta corrente após receber transferencia: ${contaCorrente.saldo}")
}