abstract class Conta(
    //construtor primário//
    val titular: String,
    val numero: Int
) {

    var saldo = 0.0
        //private set -> só pode ser modificado dentro do escopo do saldo
        protected set //-> deixa apenas protegido, podendo fazer alterações pelas filhas da herança mãe


    fun deposita (valor:Double){
        if (valor > 0){
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

//    fun transfere(valor: Double, destino: Conta): Boolean {
//        if (saldo >= valor) {
//            saldo -= valor
//            destino.saldo += valor
//            return true
//        }
//        return false
//    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0){
//            saldo = valor
//        }
//
//    }
}