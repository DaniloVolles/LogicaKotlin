package ControlFlow

fun main(args: Array<String>) {

// ----------- If

// --- Ex. 1
    var age = 20

    if (age >= 18) {
        println("Maior ou igual a 18 anos.")
    } else {
        println("Menor de 18 anos.")
    }
// --- Ex. 2
    val a = 10
    val b = 20
    val max = if (a > b) a else b
    println(max)

// --- Ex. 3
    val bankAccount = 2000
    val product = if(bankAccount > 1900) {
        "iPhone"
    } else if (bankAccount > 1500 ) {
        "Motorola"
    } else if (bankAccount > 1000 ){
        "Samsung"
    } else {
        "No Money"
    }

    println(product)

// ----------- While

    var sum = 1
    while (sum < 1_000) {
        sum += 1
        println(sum)
        break
    }

}