package com.lrosas.intro_kotlin903.temasKotlin

fun main(){
    /*
            Practica3= Imprimir una piramide de * segun el numero dado por el usuario
            n=5
            *
            **
            *
            **
            ***
            cuando se capture un 0 terminar el programa utilizando puro do-while
            practica3: formula general de la serie de fibonacci
             */


        println("Dame el valor de a")
        var a = readln().toInt()
        println("Dame el valor de b")
        var b = readln().toInt()
        println("Dame el valor de c")
        var c = readln().toInt()
        var n=0
        var comprobacion=b*b - 4 * a * c
        while (comprobacion>0){
            var x1 = (-b + Math.sqrt(comprobacion.toDouble())) / (2 * a)
            var x2 = (-b - Math.sqrt(comprobacion.toDouble())) / (2 * a)
            println("Las raices son $x1 y $x2")
            n++

        }



}