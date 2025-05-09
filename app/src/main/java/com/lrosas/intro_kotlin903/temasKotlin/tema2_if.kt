package com.lrosas.intro_kotlin903.temasKotlin

fun main(){
    print("ingrese el sueldo del empleado")
    val sueldo = readln().toDouble()
    if (sueldo>300){
        println("debe pagar impuestos")

    }else{
        println("no paga")
    }

    val mes= "1"
    when(mes){
        "1" -> println("Enero")
        "2" -> println("Nov")
        else -> println("No val")
    }

}