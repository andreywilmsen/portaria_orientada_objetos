package entidades

import negocios.ConviteBusiness
import negocios.PessoaBusiness

class Portaria {
    companion object {

        fun validarConvite(): Boolean {
            // Chama as funções de validação de inputs do usuário (Console.kt)
            val idade = Console.validarIdade()
            // Chama a função de validação de informações enviadas pelo usuário (PessoaBusiness.kt)
            val respostaIdade = PessoaBusiness.validaPessoa(Pessoa(idade))
            if (!respostaIdade) return false

            val convite = Console.validarConvite()
            var respostaConvite = ConviteBusiness.validaConvite(Convite(convite, ""))
            if (!respostaConvite) return false

            val codigo = Console.validarCodigo()
            var respostaCodigo = ConviteBusiness.validaCodigo(Convite(convite, codigo))
            if (!respostaCodigo) return false

            println("Welcome :)")
            return true
        }
    }
}