package br.com.digitalhouse.desafio

class Curso(val codigo: Int, var nome: String, var quantidadeMaximaDeAlunos: Int) {

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto
    val alunos = mutableSetOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        return other == codigo
    }

    override fun hashCode(): Int {
        return codigo
    }

    override fun toString(): String {
        return "Curso (codigo=$codigo, nome='$nome')"
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (alunos.size < quantidadeMaximaDeAlunos) {
            alunos.add(umAluno)
            return true
        }

        return false
    }

    fun excluirAluno(umAluno: Aluno): Boolean {
        return alunos.remove(umAluno)
    }
}