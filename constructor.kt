class cars(var model:String="", var name:String="",var year:Int=0)
fun main(){
    var details = cars("Mustang","Ford",1990)
    println(details.year)
    println(details.model)
    println(details.name)
}