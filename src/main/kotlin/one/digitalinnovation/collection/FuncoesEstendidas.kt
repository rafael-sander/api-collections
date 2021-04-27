package one.digitalinnovation.collection

import java.math.BigDecimal

/* Utilizando uma função estendida "somatoria" para uma Array do tipo BigDecimal
   Ele vai reduzir tudo que está nele a "valor"
*/
fun Array<BigDecimal>.somatoria() = this.reduce {
        acc, valor -> acc + valor
}

/* Função estendida "media"
se o array for vazio ou zero, a media é zero, caso contrario, soma tudo do array e
divide pelo tamanho do array
*/
fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()