package com.lrosas.intro_kotlin903.temasKotlin

fun main(){
    println("Escoge una accion")
    println("1 Suma")
    println("2 Resta")
    println("3 Division")
    println("4 multiplicacion")
    println("5 terminar")
    var opcion = readln().toInt()
    if(opcion == 1){
        println("ingresa el primer numero")
        val num1 = readln().toDouble()
        println("ingresa el segundo numero")
        val num2 = readln().toDouble()
        val resultado = num1+num2
        println("el resultado es $resultado")

    }else if(opcion == 2){
        println("ingresa el primer numero")
        val num1 = readln().toDouble()
        println("ingresa el segundo numero")
        val num2 = readln().toDouble()
        val resultado = num1-num2
        println("el resultado es $resultado")

    }else if(opcion == 3){
        println("ingresa el primer numero")
        val num1 = readln().toDouble()
        println("ingresa el segundo numero")
        val num2 = readln().toDouble()
        val resultado = num1/num2
        println("el resultado es $resultado")

    }else if(opcion == 4){
        println("ingresa el primer numero")
        val num1 = readln().toDouble()
        println("ingresa el segundo numero")
        val num2 = readln().toDouble()
        val resultado = num1*num2
        println("el resultado es $resultado")

    }else if(opcion == 5){

        println("adios")

    }


}