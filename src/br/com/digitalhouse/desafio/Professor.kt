package br.com.digitalhouse.desafio

class Professor(val codigo: Int, var nome: String, var sobrenome: String, var tempoDeCasa: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        return other is Professor && other.codigo == codigo
    }

    override fun hashCode(): Int {
        return codigo
    }

    override fun toString(): String {
        return "Professor (codigo=$codigo, nome='$nome', sobrenome='$sobrenome', tempoDeCasa=$tempoDeCasa)"
    }

}