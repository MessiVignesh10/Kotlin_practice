fun vignesh(){
    var cars = arrayOf("Mustang","Lambo","Suzuki","Tesla")
    println(cars[3])
    cars[3]="Xylo"
    println(cars[3])
    if ("Lambo" in cars){
        println(true)
    }
    else{
        println(false)
    }
    // array looping
    for (view in cars){
        println(view)
    }
}
fun main(){
    vignesh()
    vignesh()
    vignesh()
}
