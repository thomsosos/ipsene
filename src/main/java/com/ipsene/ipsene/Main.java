package com.ipsene.ipsene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("board.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("board.fxml"));
        primaryStage.setTitle("Cluedo");
        String path = "src/main/resources/com/ipsene/ipsene/Audio/pinkpanthertheme.mp3";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        primaryStage.getIcons().add(new Image("com/ipsene/ipsene/Images/Icon/magnifying-glass.png"));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
