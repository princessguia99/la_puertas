package modelo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/interfaz.fxml"));
            Parent root = loader.load();
            stage.setScene(new Scene(root, 400, 220));
            stage.setTitle("La Puertas");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
    public static void main(String[] args) { launch(args); }
}
