package entidades

class Console {
    companion object {
        // Valida os valores dos inputs, garantindo que não são vazios, nulos ou negativos
        fun validarIdade(): Int {
            var resposta: Int = 0

            do {
                println("Digite a sua idade!")
                var idade = readlnOrNull()
                if (idade.isNullOrBlank()) {
                    println("Valor inválido!")
                } else {
                    try {
                        val idadeInt = idade.toInt()
                        if (idadeInt > 0) {
                            resposta = idadeInt
                        } else {
                            println("Valor inválido!")
                        }
                    } catch (e: Exception) {
                        println("Valor inválido")
                    }
                }
            } while (resposta == null || resposta <= 0)
            return resposta
        }

        fun validarConvite(): String {
            var resposta: String? = null

            do {
                println("Digite o tipo do seu convite!")
                var convite = readln()
                if (!convite.isNullOrBlank()) {
                    resposta = convite
                } else {
                    println("Convite inválido!")
                }
            } while (resposta == null || resposta == "")
            return resposta
        }

        fun validarCodigo(): String {
            var resposta: String? = null

            do {
                println("Insira o código do convite!")
                var codigo = readln()
                if (!codigo.isNullOrBlank()) {
                    resposta = codigo
                } else {
                    println("Código inválido")
                }
            } while (resposta == null || resposta == "")
            return resposta
        }
    }
}