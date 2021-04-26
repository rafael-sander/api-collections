package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario(nome="João", salario=2000.0, tipoContratacao="CLT")
    val pedro = Funcionario(nome="Pedro", salario=1500.0, tipoContratacao="PJ")
    val maria = Funcionario(nome="Maria", salario=4000.0, tipoContratacao="CLT")

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach { println(it) }

    println("---------------------")
    println(funcionarios.find { it.nome == "Maria" })   //imprime a lista com o nome==Maria

    println("---------------------")
    funcionarios
        .sortedBy { it.salario }                       //sorteia em ord cresc o salario
        .forEach { println(it) }                       //imprime todos elem de funcionarios

    println("---------------------")
    funcionarios
        .groupBy { it.tipoContratacao }                //agrupa por tipoContratacao
        .forEach { println(it) }                       //imprime todos elem de funcionarios
}