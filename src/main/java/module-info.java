module com.example.miniproyecto_1_soleclipsado {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.miniproyecto_1_soleclipsado to javafx.fxml;
    exports com.example.miniproyecto_1_soleclipsado;

    opens com.example.miniproyecto_1_soleclipsado.controller to javafx.fxml;
    exports com.example.miniproyecto_1_soleclipsado.controller;
}