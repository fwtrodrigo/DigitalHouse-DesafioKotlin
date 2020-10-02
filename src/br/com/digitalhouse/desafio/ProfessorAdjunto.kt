package br.com.digitalhouse.desafio

class ProfessorAdjunto(codigo: Int, nome: String, sobrenome: String, tempoDeCasa: Int, var horasDeMonitoria: Int) :
    Professor(codigo, nome, sobrenome, tempoDeCasa) {

    override fun toString(): String {
        return "ProfessorTitular (codigo:$codigo, nome:'$nome', sobrenome:'$sobrenome', tempoDeCasa:$tempoDeCasa, horasDeMonitoria:$horasDeMonitoria)"
    }
}