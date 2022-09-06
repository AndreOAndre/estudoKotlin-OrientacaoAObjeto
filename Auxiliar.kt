class Auxiliar(
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
//        println("bonificação Auxiliar")
            return salario + (salario / 100 * 5) //5%//
        }

}