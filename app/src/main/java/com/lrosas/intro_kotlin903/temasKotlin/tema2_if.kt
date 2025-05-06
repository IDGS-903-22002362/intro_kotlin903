package com.lrosas.intro_kotlin903.temasKotlin

fun main(){
    print("ingrese el sueldo del empleado")
    val sueldo = readln().toDouble()
    if (sueldo>300){
        println("debe pagar impuestos")

    }else{
        println("no paga")
    }
}