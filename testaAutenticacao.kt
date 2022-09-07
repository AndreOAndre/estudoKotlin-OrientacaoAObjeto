fun testaAutenticacao() {
    val cliente = Cliente(
        nome = "andre",
        cpf = "369.258.147.00",
        senha = 2486
    )

    val gerente = Gerente(
        nome = "alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 3693
    )

    val diretora = Diretor(
        nome = "fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2582,
        plr = 200
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 3693)
    sistema.entra(diretora, 2582)
    sistema.entra(cliente, 2486)
}