fun main() {
    println("Bem vindo ao Bytebank!")
    //    println(estudoCopiaReferencia())


    var contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.setSaldo(200.0)

    var contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.setSaldo(300.0)


//    println("TITULAR:  ${contaFran.titular}")
//    println("NUMERO: ${contaFran.numero}")
//    println("SALDO:  ${contaFran.saldo}")
//    println()
//    println("TITULAR: ${contaAlex.titular}")
//    println("NUMERO: ${contaAlex.numero}")
//    println("SALDO: ${contaAlex.saldo}")

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.getSaldo())

    println("depositando na conta da Fran")
    contaFran.deposita(50.0)
    println(contaFran.getSaldo())

    println() //LINHA DE SEPARAÇÃO//

    println("sacando conta alex")
    contaAlex.saca(250.0)
    println(contaAlex.getSaldo())

    println()

    println("saque em excesso na conta do Alex")
    contaAlex.saca(300.0)
    println(contaAlex.getSaldo())

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.getSaldo())

    println()

    println("transferencia da conta da Fran para o Alex")
    if (contaFran.transfere(100.0, contaAlex)) {
        println("transferencia bem sucedida")
    } else {
        println("falha na transferencia")
    }

    println()
    println("SALDO ALEX: ${contaAlex.getSaldo()}")
    println("SALDO FRAN: ${contaFran.getSaldo()}")


}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0


    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        saldo = valor
    }
}


fun testeCondicao(saldo: Double) {

//---- if: condição de algo -> se algo acontecer faça isso ----//
    if (saldo > 0.0) {
//        println("if CONTA É POSITIVA! SALDO: $saldo")
    } else if (saldo == 0.0) {
//        println("if CONTA É NEUTRA. SALDO: $saldo")
    } else {
//        println("if CONTA NEGATIVA :( SALDO: $saldo")
    }

//---- when: quando - mais uma condição - quando isso acontecer faça isso ----//
    when {
        saldo > 0.0 -> println("when CONTA É POSITIVA! SALDO: $saldo")
        saldo == 0.0 -> println("when CONTA É NEUTRA. SALDO: $saldo")
        else -> println("when CONTA NEGATIVA :( SALDO: $saldo")
    }
//    testeCondicao(saldo)
}

fun testalaco() {
    var i = 0
    //---- while - enquanto - mais uma condição - enquanto i for meno ----//
    while (i < 5) {
        val titular = "Alex $i"
        val conta = 1000 + i
        var saldo = i + 10.0
        i++

//        println("titular da conta: $titular")
//        println("número da conta: $conta")
//        println("saldo da conta: $saldo")
//        println("")
    }
}

fun estudoCopiaReferencia() {
    //--CÓPIA--//
    // NESTE CASO CRIAMOS UMA CÓPIA DO NÚMERO X QUE SERIA 10 E SOMAMOS +1 FAZENDO QUE O X FICASSE 10 E Y FICASSE 11//
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println(numeroX)
    println(numeroY)
    //-------------------//


    //--REFERENCIA--//
    // JÁ NESSE CASO FAZEMOS UMA REFERENCIA, POIS SE TRATA DE OBJETOS. (contaMAria -ref.-> contaJoao -ref.-> Conta())
    val contaJoao = Conta()
    val contaMaria = contaJoao
    contaJoao.titular = "joão"
    contaMaria.titular = "Maria"

    println(contaJoao.titular)
    println(contaMaria.titular)
    //-------------------------//

}

fun estudoFor() {
//------- estudo com for:--------

    //----- i in 1..5 -> o indice de 1 a 5 (lembrando que o indice (i) começa do 0 para frente ----//
//    var i = 0
//    for (i in 1..5){
//        println(i)
//        println("")
//    }

    //---- i in 5 downTo 1 -> o indice contando do 5 ao 1 -> downTo -> serve para decrescente ----//
//    for (i in 5 downTo 1){
//        println(i)
//        println("")
//    }

    // ---- i in 5 downTo 1 step 2 -> o indice contando do 5 ao 1 -> step -> serve para pular o  indice -> step 2 = 5, 3, 1 ----//
//    for (i in 5 downTo 1 step 2){
//        println(i)
//        println("")


    //    for (i in 1..5) {
//
//        fun estudoBreakAndContinue() {
//
////---- parar ou pular um indice ---//
////        if(i == 4){
////            continue - neste caso a máquina vai pular o indice 4 = {1, 2, 3, 5}
////            break - neste caso a máquina vai parar de processar o código no indice determinado (4) = {1, 2, 3}
////        }
//
//        }
//
//        val titular = "Alex $i"
//        val conta = 1000 + i
//        var saldo = i + 10.0
//
//        println("titular da conta: $titular")
//        println("número da conta: $conta")
//        println("saldo da conta: $saldo")
//        println()
//        testeCondicao(saldo)
//        println(".")
//        println(".")
//    }
//    }
}



