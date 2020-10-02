package br.com.digitalhouse.desafio

class DigitalHouseManager {
    val alunos = mutableSetOf<Aluno>()
    val professores = mutableSetOf<Professor>()
    val cursos = mutableSetOf<Curso>()
    val matriculas = mutableSetOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        cursos.add(Curso(codigoCurso, nome, quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int) {
        cursos.remove(codigoCurso)
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        professores.add(ProfessorAdjunto(codigoProfessor, nome, sobrenome, quantidadeDeHoras))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        professores.add(ProfessorTitular(codigoProfessor, nome, sobrenome, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int) {
        professores.remove(codigoProfessor)
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        alunos.add(Aluno(codigoAluno, nome, sobrenome))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val aluno = alunos.first { it.equals(codigoAluno) }
        val curso = cursos.first { it.equals(codigoCurso) }

        if (curso.adicionarUmAluno(aluno)) {
            matriculas.add(Matricula(aluno, curso))
            println("Matricula realizada com sucesso!!")
        } else {
            print("Matricula não realizada pois não há vagas disponiveis")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        val pTitular = professores.first { it.equals(codigoProfessorTitular) }
        val pAdjunto = professores.first { it.equals(codigoProfessorAdjunto) }
        val curso = cursos.first { it.equals(codigoCurso) }

        curso.professorTitular = pTitular as ProfessorTitular
        curso.professorAdjunto = pAdjunto as ProfessorAdjunto
    }
}