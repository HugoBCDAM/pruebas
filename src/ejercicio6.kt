import java.util.Scanner

fun main() {
    val leer = Scanner(System.`in`);
    var piezasEntre = 0;
    var piezasMas = 0;
    var piezasMenos = 0;
    var totalPiezas = 0;

    while (true) {
        println("Introduce el peso de la pieza");
        val entrada = leer.nextLine();
        val pieza = entrada.toDoubleOrNull();

        if (pieza != null && pieza != 0.0) {
            totalPiezas++;

            if (pieza > 10) {
                piezasMas++;
            } else if (pieza < 6.5) {
                piezasMenos++;
            } else {
                piezasEntre++;
            }
        } else if (pieza == 0.0) {
            println("Saliendo...");
            break;
        } else {
            println("Error: introduce un peso válido");
        }
    }

    println("\nPiezas con peso entre 6.5 y 10: $piezasEntre");
    println("Piezas con peso mayor a 10: $piezasMas");
    println("Piezas con peso menor a 6.5: $piezasMenos");
    println("Cantidad total de piezas: $totalPiezas");
}