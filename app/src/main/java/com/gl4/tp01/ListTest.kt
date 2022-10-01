package com.gl4.tp01

fun showList(list: List<String>){
    for ( i in list){
        print("item :  $i");
    }
}
fun oddNumbersTo10(){
    for (i in 0..10){
        if (i % 2 != 0){
            print("$i est impair .")
        }
    }
}
private val languages =  listOf("java","kotlin","C++","C","javaScript","C#")
// Créez une liste ordonnée de plusieurs languages de programation

fun main(args: Array<String>) {
    println("Languages :")
    showList(languages)
    println("Odd Numbers to 10 :")
    oddNumbersTo10()
}