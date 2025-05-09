package com.lrosas.intro_kotlin903.temasKotlin

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
fun main(){
    do {
        println("Dame un numero  ")
        var opcion = readln().toInt()
        var n=0
        var asteriscos=""
        do {
            asteriscos+="*"
            println(asteriscos)
            n++
        }while (n<opcion)
    }while (opcion!=0)


}