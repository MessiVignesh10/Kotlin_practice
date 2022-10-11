public class classes {
    var carname=""
    var carmodel=""
    var year =0
}
fun main(){
    var car1 = classes()
    car1.carname= "Ford"
    car1.carmodel="Mustang"
    car1.year=2001
    var car2 = classes()
    car2.carmodel="Tavera"
    println(car1.carname+" "+car1.carmodel+" "+car1.year)
    println(car2.carmodel)
}