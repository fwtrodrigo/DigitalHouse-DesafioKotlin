package br.com.digitalhouse.desafio

class ProfessorTitular(codigo: Int, nome: String, sobrenome: String, var especialidade: String) :
    Professor(codigo, nome, sobrenome) {

    override fun toString(): String {
        return "ProfessorTitular (codigo:$codigo, nome:'$nome', sobrenome:'$sobrenome', tempoDeCasa:$tempoDeCasa, especialidade:'$especialidade')"
    }
}