package br.com.digitalhouse.desafio

abstract class Professor(val codigo: Int, var nome: String, var sobrenome: String, var tempoDeCasa: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        return other == codigo
    }

    override fun hashCode(): Int {
        return codigo
    }

    abstract override fun toString(): String
}