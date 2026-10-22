fun main() {
    try {
        println("Introduzca un número entero entre 1 y 99");
        val numero = readln().toInt();

        if (numero >= 1 && numero <= 99) {
            if (numero < 10) {
                println("El número tiene 1 dígito");
            } else {
                println("El número tiene 2 dígitos");
            }
        } else {
            println("El número no se encuentra en el rango de 1 a 99");
        }
    } catch (e: NumberFormatException) {
        println("Error: debes introducir un número válido");
    } catch (e: Exception) {
        println("Error: se ha producido un error inesperado");
    }
}