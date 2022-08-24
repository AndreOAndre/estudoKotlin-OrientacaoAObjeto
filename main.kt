fun main() {
    println("Bem vindo ao Bytebank!")
    //    println(estudoCopiaReferencia())
//    testaCondicaoConta()
//------------------------------------------------//
    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )
    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println(alex.bonificacao())
//-----------------------------------------------//
    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 3693
    )
    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")

    if (fran.autentica(senha = 3693)){
        println("autenticou com sucesso")
    } else println("falha na autenticação")
    println(fran.bonificacao())
//--------------------------------------------------//
    val gui = Diretor(
        nome = "gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 2582,
        plr = 200.0
    )
    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("salario: ${gui.salario}")
    println()

    if (gui.autentica(senha = 2582)){
        println("autenticou com sucesso")
    } else println("falha na autenticação")
    println(gui.bonificacao())


}
