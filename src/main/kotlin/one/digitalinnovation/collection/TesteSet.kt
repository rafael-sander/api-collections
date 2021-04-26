package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)    //Une funcionarios 1 e 2
    resultUnion.forEach { println(it) }

    println("-----------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)  //Subtrai de funcionarios 3 o 1
    resultSubtract.forEach { println(it) }

    println("-----------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)  //Pega oq tem em comum
    resultIntersect.forEach { println(it) }
}