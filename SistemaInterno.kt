class SistemaInterno {

    fun entra(adm: Autenticavel, senha: Int) {
        if (adm.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticacao")
        }
    }
}