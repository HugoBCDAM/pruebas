package ejerciciosObjetos

class Automovil(val marca: String, val anio: Int? = 2026) {
    var encendido: Boolean = false;

    fun arrancar() {
        if (!encendido) {
            encendido = true;
            println("El automóvil con marca $marca y año $anio ha arrancado");
        } else {
            println("El automóvil ya está arrancado");
        }
    }
}