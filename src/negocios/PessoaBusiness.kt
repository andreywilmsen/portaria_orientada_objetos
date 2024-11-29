package negocios

import entidades.Pessoa

class PessoaBusiness {
    companion object {
        // Valida se a idade da pessoa
        fun validaPessoa(pessoa: Pessoa): Boolean {
            if (pessoa.idade < 18) {
                println("Entrada proibida! Menor de idade")
                return false
            }
            return true
        }
    }
}