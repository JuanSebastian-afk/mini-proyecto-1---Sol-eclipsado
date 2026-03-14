package com.example.miniproyecto_1_soleclipsado;

import javafx.application.Application;

/**
 * Clase Launcher, encargada de la ejecución del proyecto.
 * define e implementa el método main de la aplicación, esta clase
 * se creo con el objetivo de evitar posibles errores al cargar los modulos de
 * JavaFX definiendo el método main en un archivo que no implemente la clase Application.
 */

public class Launcher {
    public static void main(String[] args) {
        Application.launch(MainApp.class, args);
    }
}
