package br.com.digitalhouse.desafio

class ProfessorTitular(codigo: Int, nome: String, sobrenome: String, tempoDeCasa: Int, var especialidade: String) :
    Professor(codigo, nome, sobrenome, tempoDeCasa) {

    override fun toString(): String {
        return "ProfessorTitular (codigo:$codigo, nome:'$nome', sobrenome:'$sobrenome', tempoDeCasa:$tempoDeCasa, especialidade:'$especialidade')"
    }
}