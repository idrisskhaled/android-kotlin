package com.gl4.tp01

fun main (argv  : Array<String>){
    print("Hello");
    /*var message: String? = "My message can possibly be null !";
    if (message != null) {
        message.uppercase()
    }*/
    //Activite de correction de code :
    var hello = "Hello" ;
    // corrigé par var car val rend la variable immutable
    hello = "Hello world!";
    println(hello);
    /********************************************/
    var toto:String = "Toto"
    // la variable toto recoit une valeur de type string et non de type int
    println(toto);
    /********************************************/
    var message: String? = "I’m learning Kotlin!";
    // cette variable est de type strin get peut etre nullable donc la point d'interrogation doit etre apres le type
    message = null
    println(message.toString())
    /********************************************/
    //Activité : Ecrire une fonction qui prend 2 valeurs en paramètres et retourne leurs somme.
    fun somme(a : Int , b : Int) : Int {
        return a + b;
    }
    //Corriger cette fonction:
    fun sayMyName(name : String) { println("$name") }
    //Simplifier cette fonction:
    fun sayHello() = "Hello"
}