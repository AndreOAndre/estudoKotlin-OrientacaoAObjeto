class Analista(
    nome: String,
    cpf: String,
    salario: Double,
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    override val bonificacao: Double
        get() {
//        println("bonificação analista")
            return salario + (salario / 100 * 10) //10%//
        }


}