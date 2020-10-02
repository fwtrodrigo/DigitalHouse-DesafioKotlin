package br.com.digitalhouse.desafio

class ProfessorAdjunto(codigo: Int, nome: String, sobrenome: String, var horasDeMonitoria: Int) :
    Professor(codigo, nome, sobrenome) {

    override fun toString(): String {
        return "ProfessorAdjunto (codigo:$codigo, nome:'$nome', sobrenome:'$sobrenome', tempoDeCasa:$tempoDeCasa, horasDeMonitoria:$horasDeMonitoria)"
    }
}