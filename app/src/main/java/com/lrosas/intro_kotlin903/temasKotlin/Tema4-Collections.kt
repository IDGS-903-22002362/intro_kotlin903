package com.lrosas.intro_kotlin903.temasKotlin
fun main() {
    /*
List
Mutablelist
Set
MutableSet
Map
MutableMap
los map son un equivalente a json
 */

    var lista = listOf<String>("Lunes", "Martes", "Miercoles")
    println(lista)
    println(lista.size)
    println(lista.get(0))
    println(lista[1])
    println(lista.indexOf("Miercoles"))
    println(lista.first())
    println(lista.last())

    var listaMutable = mutableListOf<String>("Lunes","Martes")
    println(listaMutable)
    listaMutable.add(0,"Viernes")
    listaMutable.remove("Martes")



}
