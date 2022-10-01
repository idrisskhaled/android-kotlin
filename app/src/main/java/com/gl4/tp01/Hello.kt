package com.gl4.tp01

fun main (argv  : Array<String>) {

    val rectangles  = arrayOf(Rectangle(),
        Rectangle(p = Point(-1,-3),),
        Rectangle(q = Point(2,3)),
        Rectangle(Point(2,3),Point(4,6))
    )

    fun distance(p : Point , q : Point) : Int{
        return (Math.abs(p.x - q.x) + Math.abs(p.y - q.y)) ;
    }
    for(rectangle in rectangles){
        println("les Cordonnés sont : " + rectangle.toString())
        println("la surface est :" + rectangle.surface()  )
    }
}