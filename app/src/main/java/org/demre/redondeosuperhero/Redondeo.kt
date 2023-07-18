package org.demre.redondeosuperhero

import java.lang.Math.ceil
import java.text.NumberFormat
import java.util.Currency

fun main(){
    var resultado = suma(2.3, 3.2F)
    println("El resultado es: $resultado")

    var resultado2 = redondeo(7.8)
    println("El redondeo de 7.8, es: $resultado2")

    var muestraResultado = muestraResultado(3.7)
    println(muestraResultado)

}
fun suma (param1 : Double, param2 : Float) : Double = param1 + param2

fun redondeo (param1 : Double)= ceil(param1)

fun muestraResultado(numero: Double) : String {

    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("CLP"))
    println(format.format(numero))
    return format.format(numero)


}