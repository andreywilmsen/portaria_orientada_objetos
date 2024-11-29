package negocios

import entidades.Convite
import entidades.tipoConvite

class ConviteBusiness {
    // Valida as informações pertinentes ao convite, como o tipo do convite, bem como o código do mesmo.
    companion object {
        fun validaConvite(convite: Convite): Boolean {
            var resposta: String? = null

            do {
                var convite = convite.convite.uppercase()
                try {
                    tipoConvite.valueOf(convite)
                    return true
                } catch (e: Exception) {
                    println("Tipo de convite inválido!")
                    return false
                }
            } while (resposta == null || resposta == "")
        }

        fun validaCodigo(convite: Convite): Boolean {
            val codigo = convite.codigo.uppercase()

            return try {
                val tipoEncontrado = tipoConvite.values()
                    .find { it.codigo == codigo.uppercase() && it.name == convite.convite.uppercase() }
                if (tipoEncontrado != null) {
                    return true
                } else {
                    println("Código inválido!")
                    return false
                }
            } catch (e: Exception) {
                println("Código inválido!")
                return false
            }
        }

    }
}