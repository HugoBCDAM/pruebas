package ejerciciosObjetos

class Curso(val nombre: String, val cupoMaximo: Int) {
    init {
        require(!nombre.isBlank()) {
            "El nombre no puede estar vacío";
        }
    }

    init {
        require(cupoMaximo >= 5) {
            "El cupo máximo tiene que ser mayor o igual a 5";
        }
    }
}

fun main() {
    val curso = Curso("Curso", 3);
}