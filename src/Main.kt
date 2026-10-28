fun main() {

    // Creamos los objetos necesarios
    val juego = Juego()
    val funciones = Funciones()

    var acertado = false

    // Menú principal
    println("===== ADIVINA EL NÚMERO =====")
    println("He pensado un número entre 1 y 100.")
    println("¡Intenta adivinarlo!")

    // El juego continúa hasta que el usuario acierte
    while (!acertado) {

        val numero = funciones.pedirNumero()

        acertado = funciones.comprobarNumero(numero, juego)
    }

    println("¡Gracias por jugar!")
}