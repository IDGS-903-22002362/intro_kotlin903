package com.lrosas.intro_kotlin903.temasKotlin

class usuarios() {
    val materia:String=""
}
class usuarios2(val id:Int,val nombre:String,val apellido:String) {
    val materia:String=""
    fun hola(){
        println("hola")
    }
}

fun main(){
    val alumno=usuarios()
    val alumno2=usuarios2(1,"Carlos","Lrosas")
    println(alumno2.id)
    alumno2.hola()
}