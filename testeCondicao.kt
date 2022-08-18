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