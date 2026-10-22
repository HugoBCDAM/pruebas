import java.util.Scanner

fun main() {
    val leer = Scanner(System.`in`);
    var aprobados = 0;
    var suspensos = 0;

    for (i in 1..10) {
        println("Introduzca la nota del alumno $i:");
        val entrada = leer.nextLine();
        val nota = entrada.toDoubleOrNull();

        if (nota != null && nota in 0.0..10.0) {
            if (nota >= 7) {
                aprobados++;
            } else {
                suspensos++;
            }
        } else {
            println("Error: Por favor, introduce una nota válida entre 0 y 10");
        }
    }

    println("\n=== RESULTADOS FINALES ===\n");
    println("Cantidad de alumnos con nota Aprobada (>= 7): $aprobados");
    println("Cantidad de alumnos con nota Suspensa (< 7): $suspensos");
    println("\n=== RESULTADOS FINALES ===\n");
}