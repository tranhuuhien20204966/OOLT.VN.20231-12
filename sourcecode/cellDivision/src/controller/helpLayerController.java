package controller;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class helpLayerController {

    @FXML
    private Button BackButton;
    
    @FXML
    void goBack(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/main.fxml"));
        Parent root = loader.load();
    	Scene scene = new Scene(root);
//    	helpLayerController helpController = loader.getController();
//    	helpController.goBack(event);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    	stage.show();
    	
    }

}

