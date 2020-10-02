package br.com.digitalhouse.desafio

abstract class Professor(val codigo: Int, var nome: String, var sobrenome: String, var tempoDeCasa: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        return other is Professor && other.codigo == codigo
    }

    override fun hashCode(): Int {
        return codigo
    }

    abstract override fun toString(): String
}