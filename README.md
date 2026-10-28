# 🎮 Adivina el Número en Kotlin

## 📌 Descripción

Este proyecto consiste en un juego de consola desarrollado en **Kotlin**, en el que el usuario debe adivinar un número aleatorio generado por el programa entre 1 y 100.

Después de cada intento, el programa indica si el número secreto es mayor o menor que el introducido. El juego continúa hasta que el usuario consigue adivinarlo.

## 🎯 Objetivos

- Practicar la programación en Kotlin.
- Utilizar números aleatorios.
- Trabajar con estructuras condicionales (`if`, `else` y `when`).
- Implementar bucles mediante `while`.
- Utilizar funciones y clases.
- Validar los datos introducidos por el usuario.
- Implementar un contador de intentos.

## ⚙️ Funcionamiento del juego

1. El programa genera un número aleatorio entre 1 y 100.
2. El usuario introduce un número por teclado.
3. El programa comprueba si el número es correcto.
4. Si no acierta, indica si el número secreto es mayor o menor.
5. El proceso se repite hasta adivinar el número.
6. Al acertar, se muestra el número total de intentos realizados.

## 📂 Estructura del proyecto

El proyecto está organizado en tres archivos principales:

```text
UD01_Actividad06_AdivinaNumero/
│
└── src/
    └── main/
        └── kotlin/
            ├── Main.kt
            ├── Juego.kt
            └── Funciones.kt
```

### Main.kt
Contiene la función principal del programa, muestra la bienvenida y controla la ejecución del juego mediante un bucle `while`.

### Juego.kt
Se encarga de almacenar el número secreto generado aleatoriamente y el contador de intentos.

### Funciones.kt
Contiene las funciones necesarias para solicitar números, validar los datos introducidos y comprobar si el usuario ha acertado.

## 💻 Tecnologías utilizadas

- Kotlin
- IntelliJ IDEA
- Maven
- Git y GitHub

## ▶️ Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Localizar el archivo `Main.kt`.
3. Ejecutar la función `main()`.
4. Introducir un número entre 1 y 100.
5. Seguir las pistas del programa hasta adivinar el número secreto.

## 🛡️ Validaciones

El programa controla los siguientes errores:

- Introducir números negativos.
- Introducir el número cero.
- Introducir números superiores a 100.
- Introducir letras u otros valores no numéricos.

Si el usuario introduce un valor incorrecto, el programa muestra un mensaje de error y vuelve a solicitar un número.

Los valores incorrectos no se contabilizan como intentos.

## 📚 Conclusión

Con esta actividad he practicado la generación de números aleatorios, el uso de condicionales y bucles en Kotlin.

También he aprendido a utilizar un contador de intentos, validar los datos introducidos por el usuario y organizar el código en diferentes clases para facilitar su comprensión.

---

**Autora:** Selene Muñoz Boza  
**Asignatura:** Programación Multimedia y Dispositivos Móviles (PMDM)  
**Actividad:** UD01 – Actividad 06
