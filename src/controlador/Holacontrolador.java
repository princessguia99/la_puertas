package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Holacontrolador {

    @FXML private TextField campoNombre;      
    @FXML private Label etiquetaResultado;    
    @FXML private Button botonSaludo;         

    @FXML
    private void mostrarSaludo() {
        String nombre = campoNombre.getText(); 
        etiquetaResultado.setText(
            (nombre == null || nombre.isBlank()) ? "¡Hola, mundo!" : "¡Hola, " + nombre + "!"
        );
    }
}
