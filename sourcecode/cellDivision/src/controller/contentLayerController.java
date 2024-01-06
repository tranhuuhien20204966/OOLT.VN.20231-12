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
import javafx.scene.control.ProgressBar;
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
   
    private int currentPhase = 0;
    
    private ArrayList<Image> cellDivisionProcessImage = new ArrayList<Image>();
    
    @FXML
    private ProgressBar processBar;
    
    double progress ;
    
    @FXML
    void initialize() {
    	processBar.setStyle("-fx-accent : #58b7c5");
    	
    }
    
    
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
    
    public void setImage(String imagePath, Image firstPhase) {
        Image image = new Image(imagePath);
        detailCell.setImage(image);
        CellDivision.setImage(firstPhase);
    }
    
    public void setContentCell(Object obj) {
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
      
            fieldData.add(fieldName + " :" + value);
            Label label = new Label(fieldName + " :" + value);
            Vbox.getChildren().add(label);
            
        }
        
    }
    
    @FXML
    void showNextPhase(ActionEvent event) {
    	if(currentPhase < cellDivisionProcessImage.size() - 1) {
        CellDivision.setImage(cellDivisionProcessImage.get(currentPhase + 1));
        currentPhase = currentPhase + 1;
        progress =(double) currentPhase/(cellDivisionProcessImage.size()-2);
        processBar.setProgress(progress);
    	}
    }

    @FXML
    void showPreviousPhase(ActionEvent event) {
    	if(currentPhase > 0) {
    		CellDivision.setImage(cellDivisionProcessImage.get(currentPhase - 1));
    		currentPhase = currentPhase - 1;
    		progress = (double)currentPhase/(cellDivisionProcessImage.size()-2);
    		processBar.setProgress(progress);
    	}
    }
    
    public void loadImageArray(ArrayList<Image> ImageArray ) {
    	for(Image image : ImageArray) {
    		cellDivisionProcessImage.add(image);
    	}
    }
    // Em làm cho anh thêm chức năng này nha kiểu anh có 1 mảng ảnh cellDivisionProcessImage và muốn hiển thị mỗi
    // ảnh lần lượt vào CellDivision thì xử lý các nút còn lại
	//    	Start : khi nhấn sẽ trở về ảnh đầu trong mảng cellDivisionProcessImage sau đó màn cellDivison sẽ tự động next
	//    	ảnh tầm 2,3s gì đấy cho đến ảnh cuối trong mảng cellDivisionProcessImage
	//    	Continue : khi nhấn sẽ lấy phaseCurrent và auto chạy tiếp
	//    	Pause : Lấy phasecurrent và hiển thị ảnh của phase đó
	//    	replay : giống start tuy nhiên điều kiện phaseCurrent là phase cuối
    	
    
    @FXML
    void continueProcess(ActionEvent event) {

    }


    @FXML
    void pauseProcess(ActionEvent event) {

    }

    @FXML
    void replayProcess(ActionEvent event) {

    }


    @FXML
    void startProcess(ActionEvent event) {

    }


}
   

