fun testaCondicaoConta() {
    val contaAlex = Conta("alex", 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta("fran", 1001)
    contaFran.deposita(300.0)



    println("TITULAR:  ${contaFran.titular}")
    println("NUMERO: ${contaFran.numero}")
    println("SALDO:  ${contaFran.saldo}")
    println()
    println("TITULAR: ${contaAlex.titular}")
    println("NUMERO: ${contaAlex.numero}")
    println("SALDO: ${contaAlex.saldo}")

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(50.0)
    println(contaFran.saldo)

    println() //LINHA DE SEPARAÇÃO//

    println("sacando conta alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println()

    println("saque em excesso na conta do Alex")
    contaAlex.saca(300.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println()

    println("transferencia da conta da Fran para o Alex")
    if (contaFran.transfere(destino = contaAlex, valor = 100.0)) {
        println("transferencia bem sucedida")
    } else {
        println("falha na transferencia")
    }

    println()
    println("SALDO ALEX: ${contaAlex.saldo}")
    println("SALDO FRAN: ${contaFran.saldo}")
}
