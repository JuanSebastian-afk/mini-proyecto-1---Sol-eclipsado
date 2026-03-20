package com.example.miniproyecto_1_soleclipsado.controller;

import com.example.miniproyecto_1_soleclipsado.Model.PalabraSecreta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerSceneWelcome {

    @FXML
    TextField palabraIngresada;

    @FXML
    public void onActionComenzar(ActionEvent even) throws IOException {
        String txPalabraIngresada = palabraIngresada.getText();
        PalabraSecreta palabraSecreta = new PalabraSecreta(txPalabraIngresada);

        if(palabraSecreta.palabraValida()){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/miniproyecto_1_soleclipsado/View/Game-view.fxml"));
            Parent root = loader.load();  //Para que sirve esta linea de código??

            ControllerSceneGame controllerGame = loader.getController();  // por que se inicializa con esas funcinones??
            controllerGame.setModelo(palabraSecreta);
            controllerGame.iniciarJuego();

            Stage stage = (Stage) ((Node) even.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }else{
            System.out.println("Palabra no valida: Porfavor ingrese una palabra que tenga entre 6 y doce letras");
        }


    }



}
