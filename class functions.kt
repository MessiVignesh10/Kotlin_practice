class carss(var model:String="", var name:String="",var year:Int=0)
{
    fun Vignesh(){
        println("hello from carss Class")
    }
    fun Secret(word:String){
        println("The secret word is ...... "+word)
    }
}
fun main(){
    var c1 = carss("Mustang","Ford",2001)
    var c2 = carss("Mustang","Ford",2001)
    println(c1.name)
    c1.Vignesh()
    c2.Secret("0**rTYuX3")
}
