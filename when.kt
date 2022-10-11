// when is used instead of large number of if else Statements
fun main() {
    var day = 7
    val name = when (day){
        1 -> "Monday"
        2 -> "Tuesday"
        3-> "Wedneday"
        4 -> "Thursday"
        5 -> "friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "invalid day"
    }
    print (name)
}