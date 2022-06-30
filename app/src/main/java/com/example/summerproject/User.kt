package com.example.summerproject

data class User(var name:String, var weight:Double, var height:Int, var age:Int ) {

    fun count(): Double{
        val res: Double = if(this.height > 160 && this.weight > 50.0){
            (this.age * this.height)/(this.name.length * this.weight) * 5
        } else{
            ((this.name.length * this.weight)/(this.height * this.weight))/(this.age * this.height)
        }
        return res
    }
}