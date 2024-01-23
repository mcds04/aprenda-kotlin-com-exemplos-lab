enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val nivel: Nivel)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado com sucesso na formação ${this.nome}.")
    }
}

fun main() {
    val usuario1 = Usuario("João Vitor", Nivel.BASICO)
    val usuario2 = Usuario("Maria Cristina", Nivel.INTERMEDIARIO)

    val conteudo1 = ConteudoEducacional("Introdução à Programação", 60)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 120)

    val formacao = Formacao("Formação em Kotlin", listOf(conteudo1, conteudo2))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}
