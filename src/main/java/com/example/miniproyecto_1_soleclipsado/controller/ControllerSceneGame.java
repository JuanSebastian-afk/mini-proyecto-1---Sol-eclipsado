package com.example.miniproyecto_1_soleclipsado.controller;

import com.example.miniproyecto_1_soleclipsado.Model.PalabraSecreta;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Clase controladora para la vista del juego Sol Eclipsado.
 * Gestiona los eventos de los botones y la actualización de la interfaz.
 * @author Juan Sebastian Valencia y Andrés Lenis
 * @version 0.1.0
 */


public class ControllerSceneGame {

    PalabraSecreta model;

    @FXML
    private ImageView imgEstadoEclipse;

    @FXML
    private HBox HBoxPalabraSecreta;

    public void setModelo(PalabraSecreta palabraSecreta) {model = palabraSecreta;}

    public void iniciarJuego(){
        if(model != null){
            crearCasillas(model);
            actualizarImagen();
        }
    }


    //Este arreglo contiene las rutas a las imagenes del eclipse solar, su objetivo es proporcionar un acceso rapido y como a las rutas.
    private String[] rutasEclipses= {
            "/com/example/miniproyecto_1_soleclipsado/Images/Logo.png",//cero fallos
            "/com/example/miniproyecto_1_soleclipsado/Images/eclipse1.png", //un fallo
            "/com/example/miniproyecto_1_soleclipsado/Images/eclipse2.png", //dos fallos
            "/com/example/miniproyecto_1_soleclipsado/Images/eclipse3.png", //tres fallos
            "/com/example/miniproyecto_1_soleclipsado/Images/eclipse4.png", //cuatro fallos
    };

    //Variable encargada de contar los fallos del jugador PASARLA AL MODELO
    private int fallos = 0;

    //Métpdp encargado de la actualización de la imagen del sol eclipsado.
    private void actualizarImagen(){
        if(fallos < rutasEclipses.length){
            Image imagenAux = new Image(getClass().getResourceAsStream(rutasEclipses[fallos]));

            imgEstadoEclipse.setImage(imagenAux);
        }
    }

    private void crearCasillas(PalabraSecreta palabraSecreta){
        HBoxPalabraSecreta.getChildren().clear();

        for(int i = 0; i < palabraSecreta.getCantidadLetras(); i++){
            TextField casilla = new TextField();
            casilla.setPrefHeight(40);
            casilla.setPrefWidth(40);
            casilla.setAlignment(Pos.CENTER);
            casilla.setStyle("-fx-font-size: 18; -fx-font-weight: bolt");
        }
    }


}
