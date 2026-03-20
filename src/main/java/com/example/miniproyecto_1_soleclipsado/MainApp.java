package com.example.miniproyecto_1_soleclipsado;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal para el juego Sol Eclipsado.
 * Extiende de la clase Application, implementa el Stage
 * del juego conel método start y carga la GUI usando La clase FXMLLoader.
 * @author Juan Sebastian Valencia y Andrés Lenis
 * @version 0.1.0
 */

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/com/example/miniproyecto_1_soleclipsado/View/Game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Sol Eclipsado");
        stage.setScene(scene);
        stage.show();
    }
}
