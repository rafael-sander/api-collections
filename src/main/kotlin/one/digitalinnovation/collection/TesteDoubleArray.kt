package one.digitalinnovation.collection

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 5000.0

    salarios.forEach { println(it) }
    println("-----------")

    salarios.forEachIndexed { index, salario ->    //trabalha com os indices do array e val salario
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }
    println("-----------")

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}

