import java.util.Scanner

fun main() {
    val leer = Scanner(System.`in`);
    println("Introduzca un número entero");
    val num = leer.nextInt();

    if (num in 0..999) {
        if (num in 0..9) {
            println("El número $num tiene 1 dígito");
        } else if (num in 10..99) {
            println("El número $num tiene 2 dígitos");
        } else {
            println("El número $num tiene 3 dígitos");
        }
    } else {
        println("Error: No se ha introducido un número válido entre 0 y 999");
    }
}