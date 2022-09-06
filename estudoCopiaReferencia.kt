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
    val contaJoao = ContaCorrente("joao", 1002)
    val contaMaria = contaJoao
    println(contaJoao.titular)
    println(contaMaria.titular)
    //-------------------------//

}