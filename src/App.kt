fun main() {
//    var x = 3
//    val name = "Mason"
//    x *= 10
//    println("x is $x")
//
//    println("x before the while loop is: $x")
//    while (x-- > 20) {
//        print("$x-")
//    }
//    println("x AFTER the while loop is: $x")
//
//    for (i in 1..10) {
//        x++
//        print("$x+")
//    }
//    println("x AFTER the FOR loop is: $x")
//
//    if (x == 20) {
//        println("x must be twenty")
//    } else {
//        println("x isn't twenty")
//    }
//
//    var y = 9
//    when {
//        x < y -> println("x is SMALL")
//        x > y -> println("x is LARGE")
//        else -> println("x is equal to y")
//    }
//
//    if (x < 5) println("x is SMALL")
    val index = arrayOf(1, 3, 4, 2)
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    var x = 0
    var y: Int

    while (x < 4) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x += 1
    }
}
