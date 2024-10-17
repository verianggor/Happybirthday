//fun main() {
//    val child = 5
//    val adult = 28
//    val senior = 87
//
//    val isMonday = true
//
//    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
//    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
//    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
//}
//
//fun ticketPrice(age: Int, isMonday: Boolean): Int {
//    return when(age) {
//        in 0..12 -> 15
//        in 13..60 -> if (isMonday) 25 else 30
//        in 61..100 -> 20
//        else -> -1
//    }
//}

//fun main() {
//    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
//    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
//    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
//}
//
//fun printFinalTemperature(
//    initialMeasurement: Double,
//    initialUnit: String,
//    finalUnit: String,
//    conversionFormula: (Double) -> Double
//) {
//    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
//    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
//}


//fun main() {
//    val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
//    brunoSong.printDescription()
//    println(brunoSong.isPopular)
//}
//
//class Song(
//    val title: String,
//    val artist: String,
//    val yearPublished: Int,
//    val playCount: Int
//){
//    val isPopular: Boolean
//        get() = playCount >= 1000
//
//    fun printDescription() {
//        println("$title, performed by $artist, was released in $yearPublished.")
//    }
//}

//fun main() {
//    val amanda = Person("Amanda", 33, "play tennis", null)
//    val atiqah = Person("Atiqah", 28, "climb", amanda)
//
//    amanda.showProfile()
//    atiqah.showProfile()
//}
//
//class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
//    fun showProfile() {
//        println("Name: $name")
//        println("Age: $age")
//        if(hobby != null) {
//            print("Likes to $hobby. ")
//        }
//        if(referrer != null) {
//            print("Has a referrer named ${referrer.name}")
//            if(referrer.hobby != null) {
//                print(", who likes to ${referrer.hobby}.")
//            } else {
//                print(".")
//            }
//        } else {
//            print("Doesn't have a referrer.")
//        }
//        print("\n\n")
//    }
//}


//open class Phone(var isScreenLightOn: Boolean = false){
//    open fun switchOn() {
//        isScreenLightOn = true
//    }
//
//    fun switchOff() {
//        isScreenLightOn = false
//    }
//
//    fun checkPhoneScreenLight() {
//        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
//        println("The phone screen's light is $phoneScreenLight.")
//    }
//}
//
//class FoldablePhone(var isFolded: Boolean = true): Phone() {
//    override fun switchOn() {
//        if (!isFolded) {
//            isScreenLightOn = true
//        }
//    }
//
//    fun fold() {
//        isFolded = true
//    }
//
//    fun unfold() {
//        isFolded = false
//    }
//}
//
//fun main() {
//    val newFoldablePhone = FoldablePhone()
//
//    newFoldablePhone.switchOn()
//    newFoldablePhone.checkPhoneScreenLight()
//    newFoldablePhone.unfold()
//    newFoldablePhone.switchOn()
//    newFoldablePhone.checkPhoneScreenLight()
//}


//fun main() {
//    val winningBid = Bid(5000, "Private Collector")
//
//    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
//    println("Item B is sold at ${auctionPrice(null, 3000)}.")
//}
//
//class Bid(val amount: Int, val bidder: String)
//
//fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
//    return bid?.amount ?: minimumPrice
//}