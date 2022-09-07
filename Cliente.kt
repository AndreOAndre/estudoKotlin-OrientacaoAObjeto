class Cliente(
    val nome: String,
    val cpf: String,
   private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            println("autentica interface")
            return true
        }
        return false
    }

}