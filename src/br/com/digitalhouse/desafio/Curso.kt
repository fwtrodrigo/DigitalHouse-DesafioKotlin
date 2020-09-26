package br.com.digitalhouse.desafio

class Curso(val codigo: Int, var nome: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        return other is Curso && other.codigo == codigo
    }

    override fun hashCode(): Int {
        return codigo
    }

    override fun toString(): String {
        return "Curso (codigo=$codigo, nome='$nome')"
    }

}