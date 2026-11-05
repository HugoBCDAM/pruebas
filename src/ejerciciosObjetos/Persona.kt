package ejerciciosObjetos

class Persona(val nombre: String, var edad: Int) {
    fun cumplirAnios() {
        this.edad += 1;
        println("¡Felicidades acabas de cumplir $edad años!");
    }
}