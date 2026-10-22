fun main() {
    try {
        println("Introduzca la primera nota");
        val nota1 = readln().toDouble();

        println("Introduzca la segunda nota");
        val nota2 = readln().toDouble();

        println("Introduzca la tercera nota");
        val nota3 = readln().toDouble();

        println("Introduzca la cuarta nota");
        val nota4 = readln().toDouble();

        val promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        println("Promedio de las notas: $promedio");

        if (promedio < 5) {
            println("Suspenso");
        } else {
            println("Aprobado");
        }
    } catch (e: NumberFormatException) {
        println("Error: debes introducir un número válido");
    } catch (e: Exception) {
        println("Error: se ha producido un error inesperado");
    }
}