class Funciones {

    // Solicita un número y comprueba que sea válido
    fun pedirNumero(): Int {

        while (true) {
            print("Introduce un número entre 1 y 100: ")
            val numero = readln().toIntOrNull()

            if (numero == null || numero !in 1..100) {
                println("Error: el número debe estar entre 1 y 100.")
            } else {
                return numero
            }
        }
    }

    // Compara el número introducido con el número secreto
    fun comprobarNumero(numero: Int, juego: Juego): Boolean {

        juego.intentos++

        when {
            numero < juego.numeroSecreto -> {
                println("El número secreto es mayor.")
            }

            numero > juego.numeroSecreto -> {
                println("El número secreto es menor.")
            }

            else -> {
                println("¡Correcto! Has adivinado el número.")
                println("Has necesitado ${juego.intentos} intentos.")
                return true
            }
        }

        return false
    }
}