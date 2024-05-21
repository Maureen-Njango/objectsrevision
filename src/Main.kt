fun main() {
    println("Hello World!")
    val car = Car("Audi")
    car.drive(10)
    car.drive(0)
    car.turnoffEngine()
    carry(30)

    val s = "elbow"
    val t = "below"

    println(isAnagram(s, t))

}
class Car (carBrand:String){
    private var isTunedOn = false
    var speed = 0
    var brand = carBrand

    fun startEngine(){
        println("bbbbrrrrrrrrrr vmmmmmmmmmm")
        Thread.sleep(1000)
        println("your $brand is now turned on")
        Thread.sleep(1000)
        isTunedOn= true



    }
    fun drive(speed:Int){
        if (isTunedOn) {
            if (speed>0) {
                println("car is driving")
            }
            else{
                println("car cannot drive while engine is not turned on")

            }
        }
    }
    fun turnoffEngine(){
        if (isTunedOn){
            isTunedOn = false
            println("Engine turned on successfully ")
        }else{
            println("Your engine is already turned off")
        }
    }
}
//- carry(people: Int) : Prints out "Carrying $people passengers" if the number of people is within its capacity else it prints out "Over capacity by $x people" where x is the number of people exceeding its capacity. (3 points)
//-  identity() : Prints out the color, make and model in the following format e.g:  "I am a white subaru legacy" (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the parking fees by multiplying the hours by 20 (1 point)

fun carry(people: Int) {
    val capacity = 5
    if (people <= capacity) {
        println("Carrying $people passengers")
    } else {
        val excess = people - capacity
        println("Over capacity by $excess people")
    }
}
fun identity(color: String, make: String, model: String) {
    println("I am a $color $make $model")
}
fun calculateParkingFees(hours: Int): Int {
    return hours * 20
}
//Write a function that takes in a list of Car objects each with a registration and mileage attribute and returns the average mileage of all the vehicles in the list.


fun calculateAverageMileage(cars: List): Double {
    if (cars.isEmpty()) {
        return 0.0
    }

    var totalMileage = 0.0
    for (car in cars) {
        totalMileage += car.mileage
    }

    return totalMileage / cars.size
}

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.Given two strings s and t, return true if t is an anagram of s, and false otherwise. Assume both strings are entirely in lowercase
//e.g s = "elbow", t = "below" should return true  in kotlin
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }

    val sChars = s.toCharArray().sorted()
    val tChars = t.toCharArray().sorted()

    return sChars == tChars
}