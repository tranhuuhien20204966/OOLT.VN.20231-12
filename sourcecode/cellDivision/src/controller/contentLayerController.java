package controller;

import javafx.scene.control.Label;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class contentLayerController {

    @FXML
    private Button BackButton;
    
    @FXML
    private ImageView detailCell;
    
    @FXML
    private ImageView CellDivision;
    
    @FXML
    private Button nextbutton;

    @FXML
    private Button previousButton;
    
    @FXML
    private VBox Vbox ;
   
    public VBox getVBox() {
        return Vbox;
    }
    
    private ArrayList<Image> cellDivisionProcessImage = new ArrayList<Image>();
    
    @FXML
    void goBack(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceen/main.fxml"));
        Parent root = loader.load();
    	Scene scene = new Scene(root);
//    	helpLayerController helpController = loader.getController();
//    	helpController.goBack(event);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    	stage.show();
    }
    
    public void setImage(String imagePath, Image firstPhase) {
        Image image = new Image(imagePath);
        detailCell.setImage(image);
        CellDivision.setImage(firstPhase);
    }
    
    public void setContentCell(Object obj, VBox vbox) {
    	Class<?> clazz = obj.getClass();
        // Lấy tất cả các trường của lớp
        Field[] fields = clazz.getDeclaredFields();
        ObservableList<String> fieldData = FXCollections.observableArrayList();
        for (Field field : fields) {
            field.setAccessible(true); // Cho phép truy cập trường private
            String fieldName = field.getName();
            Object value;

            try {
                value = field.get(obj);
            } catch (IllegalAccessException e) {
                value = "Cannot access the field";
            }
            System.out.println("Field: " + fieldName + ", Value: " + value);
            fieldData.add(fieldName + " :" + value);
            Label label = new Label(fieldName + " :" + value);
            Vbox.getChildren().add(label);
            
        }
        
    }
    
    @FXML
    void showNextPhase(ActionEvent event) {

    }

    @FXML
    void showPreviousPhase(ActionEvent event) {

    }
    
    public void loadImageArray(ArrayList<Image> ImageArray ) {
    	for(Image image : ImageArray) {
    		cellDivisionProcessImage.add(image);
    	}
    }

}
   

