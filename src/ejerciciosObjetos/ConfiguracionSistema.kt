package ejerciciosObjetos

class ConfiguracionSistema private constructor(val clave: String) {
    constructor() : this("CLAVE_DEFECTO");
}

fun main() {
    val configuracion = ConfiguracionSistema();
    println("Clave: ${configuracion.clave}");
}