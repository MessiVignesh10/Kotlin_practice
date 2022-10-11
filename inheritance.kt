// must use open for the class then only it will perform inherit function
open class Staffs(){
    var name1="Milan"
    fun execute(){
        println("The staff name from Staffs function is  ")
    }
}
class students:Staffs(){
    fun myfunction(){
        println("the name is "+name1)
    }


}
fun main(){
    var n1 = students()
    n1.execute()
    n1.myfunction()
}