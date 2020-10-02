package br.com.digitalhouse.desafio

fun main() {
    val dh = DigitalHouseManager()

    dh.registrarProfessorTitular("T Prof  1", "Bigas", 1, "Matematica")
    dh.registrarProfessorAdjunto("A Prof 2", "Romama", 2, 10)

    dh.registrarProfessorTitular("T Prof  3", "Miudo", 3, "Portugues")
    dh.registrarProfessorAdjunto("A Prof 4", "Bill", 4, 8)

    dh.registrarCurso("FullStack", 20001, 3)
    dh.registrarCurso("Android", 20002, 2)

    dh.alocarProfessores(20001, 1, 2)
    dh.alocarProfessores(20002, 3, 4)

    dh.matricularAluno("Rodrigo", "Freitas", 10)
    dh.matricularAluno("Renato", "Pereira", 20)
    dh.matricularAluno("Ricardo", "Santos", 30)
    dh.matricularAluno("Murilo", "Stonks", 40)
    dh.matricularAluno("Stevao", "Sowin", 50)
    dh.matricularAluno("Boleto", "Sufiti", 60)
    dh.matricularAluno("Andressa", "Lins", 70)
    dh.matricularAluno("Android", "Guugol", 80)

    dh.matricularAluno(10, 20001)
    dh.matricularAluno(20, 20001)
    dh.matricularAluno(30, 20002)
    dh.matricularAluno(40, 20002)
    dh.matricularAluno(50, 20002)
}
