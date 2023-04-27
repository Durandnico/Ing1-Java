package com.example.TD_teams;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class JusteUnBouton extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        /* set title */
        primaryStage.setTitle("Juste un bouton !");

        /* Création d'un bouton */
        Button b = new Button("Clique moi");

        /* Création de la fenetre */
        FlowPane root = new FlowPane();

        /* ajouter le bouton à la scene */
        root.getChildren().add(b);

        /* création d'une scene et de son association avec */
        /* la fenêtre + taille */
        Scene scene = new Scene(root, 500, 300);

        /* Ajouter la scene */
        primaryStage.setScene(scene);

        /* rendre la fenêtre visible */
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
