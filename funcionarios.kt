class funcionarios(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    fun bonificacao (): Double {
        return salario / 100 * 10
    }

}