abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    abstract val bonificacao: Double


    fun estudoFuncaoProperty() {
        //-----SINTAXE MAIS COMPELXA FUNÇÃO-----//

//    open fun bonificacao(): Double {
//        return salario / 100 * 10
//    }


        //---------------------------OUTRA FORMA DE APLICAR A BONIFICAÇÃO- PROPERTY-------------------//

        //-----SINTAXE MAIS COMPELXA PROPERTY-----//

//    open val bonificacao: Double
//        get() {
//            return salario / 100 * 10
//        }
//}


        //-----SINTAXE MAIS OTIMIZADA PROPERTY-----//

//    open val bonificacao: Double get() = salario / 100 * 10
    }
}
