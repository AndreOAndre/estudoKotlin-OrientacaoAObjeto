class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    var plr: Double
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