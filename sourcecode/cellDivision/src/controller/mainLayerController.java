package controller;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import model.eukaryoticCell;
import model.prokaryoticCell;

public class mainLayerController {

    @FXML
    private MenuItem EukaryItem;

    @FXML
    private MenuItem prokaItem;
    

    
    @FXML
    private BorderPane scenePane;
    
    Stage stage;
    private Scene originalScene;
    
   
    
    @FXML
    void Exit(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Exit");
    	alert.setHeaderText("You're exit");
    	alert.setContentText("Do you want to exit?");
    	if(alert.showAndWait().get() == ButtonType.OK) {
    		stage = (Stage)scenePane.getScene().getWindow();
    		System.out.println("You're exited");
    		stage.close();
    	}
    	
    }

    @FXML
    void displayMitosis(ActionEvent event) throws IOException {
    	 int i = 0;
	       ArrayList<Image> Mitosis = new ArrayList<Image>(); // You can change 10 to the desired size
	        do {
			    try {
			        Mitosis.add(new Image("/image/eukaryotic/Mitosis/Mi_phase" + (i + 1) + ".png"));
			        ++i;
			        System.out.println("Ok" + i);
			    } catch (Exception e) {
			        /// In thông báo lỗi
			        
			        // Exit vòng l
			        break;
			    }
			} while (true);
	            
  		eukaryoticCell eukaCell = new eukaryoticCell();
  		MenuItem clickedMenuItem = (MenuItem) event.getSource();
  		stage = (Stage) clickedMenuItem.getParentPopup().getOwnerWindow();
          showcellDivisionImage("/image/eukaryotic/euka.png	", stage, eukaCell, Mitosis);
          (new eukaryoticCell()).DisplayCellOfInfor();
    }
    
    @FXML
    void displayMeiosis(ActionEvent event) throws IOException {
   	 int i = 0;
     ArrayList<Image> Meiosis = new ArrayList<Image>(); // You can change 10 to the desired size
      do {
		    try {
		        Meiosis.add(new Image("/image/eukaryotic/Meiosis/Me_phase" + (i + 1) + ".png"));
		        ++i;
		        System.out.println("Ok" + i);
		    } catch (Exception e) {
		        /// In thông báo lỗi
		        
		        // Exit vòng l
		        break;
		    }
		} while (true);
          
	eukaryoticCell eukaCell = new eukaryoticCell();
	MenuItem clickedMenuItem = (MenuItem) event.getSource();
	stage = (Stage) clickedMenuItem.getParentPopup().getOwnerWindow();
    showcellDivisionImage("/image/eukaryotic/euka.png", stage, eukaCell, Meiosis);
    (new eukaryoticCell()).DisplayCellOfInfor();
    }


    @FXML
    void displayAmitosis(ActionEvent event) throws IOException {
    		
        int i = 0;
	       ArrayList<Image> Amitosis = new ArrayList<Image>(); // You can change 10 to the desired size
	        do {
			    try {
			        Amitosis.add(new Image("/image/prokaryotic/amitosis/phase" + i + ".png"));
			        ++i;
			        System.out.println("Ok" + i);
			    } catch (Exception e) {
			        /// In thông báo lỗi
			        
			        // Exit vòng l
			        break;
			    }
			} while (true);
	            
    		prokaryoticCell prokaCell = new prokaryoticCell();
    		stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            showcellDivisionImage("/image/prokaryotic/proka.jpg", stage, prokaCell, Amitosis);
            (new prokaryoticCell()).DisplayCellOfInfor();
        }
    
    

    @FXML
    void displayInforHelp(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceen/help.fxml"));
        Parent root = loader.load();
    	Scene scene = new Scene(root);
//    	helpLayerController helpController = loader.getController();
//    	helpController.goBack(event);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    	stage.show();
    	
    }	
    

 
    private void showcellDivisionImage(String imagePath,Stage stage, Object object, ArrayList<Image> ImageList) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceen/content.fxml"));
        Parent root = loader.load();
        contentLayerController imageScreenController = loader.getController();
        imageScreenController.setImage(imagePath, ImageList.get(0));
        imageScreenController.setContentCell(object);
        imageScreenController.loadImageArray(ImageList);
//        Stage stage = new Stage();
//        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        
    }
    

}

