package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios) {
        println(salario)
    }
    println("----------------")

    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Média salarial: ${salarios.average()}")
    println("----------------")

    val salariosMaiorQue2500 = salarios.filter { it>2500.0 } //seleciona valores >2500.0
    salariosMaiorQue2500.forEach { println(it) }

}