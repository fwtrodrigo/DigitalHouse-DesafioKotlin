package br.com.digitalhouse.desafio

class Aluno(val codigo: Int, var nome: String, var sobrenome: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        return other is Aluno && other.codigo == codigo
    }

    override fun hashCode(): Int {
        return codigo
    }

    override fun toString(): String {
        return "Aluno (codigo=$codigo, nome='$nome', sobrenome='$sobrenome')"
    }

}


