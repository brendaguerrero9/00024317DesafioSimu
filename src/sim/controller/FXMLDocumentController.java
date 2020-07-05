/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Brenda
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblBien;
    
    @FXML
    private Label lbl;

    @FXML
    public Button btnWelcome;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("/sim/fxml/FXMLMoEcu.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        
        //Sonido
        AudioClip sound = new AudioClip(this.getClass().getResource("/effects/sonidoButton.mp3").toExternalForm());
        sound.play();
        
        //Transicion pag
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(2), root);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(10);
        fadeIn.setCycleCount(1);
        fadeIn.setAutoReverse(true);
        fadeIn.play();
        
        
        stage.setResizable(false);
        stage.show();
       ((Node)(event.getSource())).getScene().getWindow().hide();
       
       
        
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    
}
}