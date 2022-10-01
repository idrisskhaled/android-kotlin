package com.gl4.tp01

fun main(args: Array<String>) {
    fun appl( a: List<Int>, b: List<Int>,
              f: (Int,Int)-> Int ) : MutableList<Int> {
        var r = mutableListOf<Int>()
        val s = if (a.size < b.size) a.size else b.size
        for( i in 0..s-1 )
            r.add( f( a[i], b[i] ) )
        return r
    }

    fun fu ( i: Int, j: Int) : Int { return i*i + j*j }
    val q = listOf( 2, 6, 8 , 99)
    val p = listOf<Int>( -1, 7, 90, 14)
//passer une fonction en paramètre
    val res = appl(p, q, ::fu ) //le nom de fonction précédé par :: ou par NomClasse:: si la fonction est définie dans une classe

}