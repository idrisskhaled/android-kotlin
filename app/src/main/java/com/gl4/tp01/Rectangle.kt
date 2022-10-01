package com.gl4.tp01

data class Rectangle(
    var p: Point  = Point(0,0),
    var q: Point = Point(1,1)
){
    override fun toString(): String {
        return "p=$p q=$q"
    }
    fun surface() : Int{
      var longuer : Int = Math.abs(this.p.x - this.q.x)
      var largeur : Int = Math.abs(this.p.y - this.q.y)
      return longuer * largeur
    }
}
