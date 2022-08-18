fun main() {
    println("Bem vindo ao Bytebank!")
    //    println(estudoCopiaReferencia())
//    testaCondicaoConta()

    val alex = funcionarios(nome = "Alex", cpf = "111.111.111-11", salario = 1000.0)
    println(alex.nome)
    println(alex.cpf)
    println(alex.salario)

    print(alex.bonificacao())
}
