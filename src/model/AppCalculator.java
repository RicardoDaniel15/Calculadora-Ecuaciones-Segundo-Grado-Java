package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppCalculator extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Usar una ruta relativa para cargar el archivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("/view/home.fxml"));

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("MathRays");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
