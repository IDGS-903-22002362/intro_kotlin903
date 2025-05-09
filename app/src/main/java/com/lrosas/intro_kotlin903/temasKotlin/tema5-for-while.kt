package com.lrosas.intro_kotlin903.temasKotlin

fun main(){
    /*
    Range
    1..4=1,2,3,4
    1..<4=1,2,3
    4 douwnTo 1= 4,3,2,1
    1..5 step 2= 1,3,5
    'a'..'z'
     */

    for (num in 1..5){
        println(num)
    }
    val frutas = listOf<String>("manzana","durazno","pera")
    for (fruta in frutas){
        println(fruta)
    }
    val n= 18
    var m =0
    while (m<n){
        println(m)
        m++
    }

}