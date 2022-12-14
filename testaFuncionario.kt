fun testaFuncionario() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )
    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificação: ${alex.bonificacao}")
    println()
//-----------------------------------------------//
    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 3000.0,
        senha = 3693
    )
    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")

    if (fran.autentica(senha = 3693)) {
        println("autenticou com sucesso")
    } else println("falha na autenticação")
    println("bonificação: ${fran.bonificacao}")
    println()
//--------------------------------------------------//
    val gui = Diretor(
        nome = "gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 2582,
        plr = 200
    )
    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("salario: ${gui.salario}")

    if (gui.autentica(senha = 2582)) {
        println("autenticou com sucesso")
    } else println("falha na autenticação")
    println("bonificação: ${gui.bonificacao}")
    println()

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 2000.0
    )

    println("nome: ${maria.nome}")
    println("cpf: ${maria.cpf}")
    println("salario: ${maria.salario}")
//--------------------------------------------------//
    val calculadora = CalculadoraBonificacao()

    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    print("Total da bonificação da empresa: ${calculadora.total}")

}