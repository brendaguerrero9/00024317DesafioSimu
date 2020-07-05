/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Brenda
 */
public class FXMLPaso1Controller implements Initializable {
    
    @FXML
    public Button btnStep1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("/sim/fxml/FXMLPaso2.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        stage.setTitle("MEF 3D");
        stage.getIcons().add(new Image("/img/dino.png"));
        ((Node)(event.getSource())).getScene().getWindow().hide();
        
        AudioClip sound = new AudioClip(this.getClass().getResource("/effects/sonidoButton.mp3").toExternalForm());
        sound.play();
    
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
