class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(
    nome = nome, cpf = cpf, salario = salario
){
//    fun bonificacao(): Double {
//        return salario / 100 * 20
//    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}