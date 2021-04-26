package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios) {
        println(salario)
    }
    println("----------------")

    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")
    println("----------------")

    val salariosMaiorQue2500 = salarios.filter { it>2500.0 } //seleciona valores >2500.0
    salariosMaiorQue2500.forEach { println(it) }
    println("----------------")

    println(salarios.count { it in 2000.0..5000.0 }) //qtos elementos em um range
    println("----------------")

    println(salarios.find { it == 2250.0 }) //encontra um elemento
    println(salarios.find { it == 500.0 })  //não encontra nada
    println("----------------")

    println(salarios.any { it == 1000.0 }) //existe o valor?
    println(salarios.any { it == 500.0 })
}