package study.exercises.ifElsePack

/*
Esreva um programa capaz de ler 3 números inteiros que representam os lados de um triangulo.
Informe se é um triangulo equilátero (todos os lados iguais)
 */

fun main() {

    println("In this program let's determine if a triangle is equilateral.\n" +
            "Please, input the first side size:")
    val a = readln()

    println("Please, input the second side size:")
    val b = readln()

    println("Please, input the third side size:")
    val c = readln()

    if (a == b && a == c) {
        println("This is an equilateral triangle.")
    } else {
        println("This is not an equilateral triangle.")
    }
}