/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 *
 * @author Brenda
 */
public class Sim extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/FXMLDocument.fxml"));
       
        
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
        stage.setResizable(false);
        AudioClip sound = new AudioClip(this.getClass().getResource("/effects/track.mp3").toExternalForm());
        sound.setVolume(0.3);
        sound.play();
        stage.show();
        stage.setTitle("MEF 3D");
        stage.getIcons().add(new Image("/img/dino.png"));
     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
