abstract class FuncionarioAdm(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario,
), Autenticavel {
    abstract override val bonificacao: Double

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            println("autentica adm")
            return true
        }
        return false
    }
}


