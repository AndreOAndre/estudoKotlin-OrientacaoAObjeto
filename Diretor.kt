class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    var plr: Int
): Funcionario(
    nome = nome, cpf = cpf, salario = salario
){
    override val bonificacao: Double
        get() {
//        println("bonificação diretor")
            return salario + plr
        }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}