package org.example.arqteturasgato;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("tela.fxml"));
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.setTitle("Cadastro de Gato");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



