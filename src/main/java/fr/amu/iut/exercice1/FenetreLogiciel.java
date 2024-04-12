package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // code de l'exercice 1

        VBox vbox = new VBox();

        // Création du conteneur correspondant à la ligne de contrôle haut dessus du tableau
        HBox topControls = new HBox();
        topControls.setAlignment( Pos.TOP_LEFT );
        Button btnRefresh = new Button("File");





        // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("exo1");

        // Affichage de la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

