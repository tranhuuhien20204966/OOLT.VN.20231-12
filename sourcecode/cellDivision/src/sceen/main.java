package sceen;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class main extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		
	    try {
	        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
	        Scene scene = new Scene(root);
	        stage.setTitle("Cell Division");
	        stage.setScene(scene);
	        stage.show();
	        stage.setOnCloseRequest(event -> {
	        event.consume();
	        Exit(stage);
	        });
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	void Exit(Stage stage) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Exit");
    	alert.setHeaderText("You're exit");
    	alert.setContentText("Do you want to exit?");
    	if(alert.showAndWait().get() == ButtonType.OK) {
    		System.out.println("You're exited");
    		stage.close();
    	}
    	
    }


	public static void main(String[] args) {
		launch(args);
	}
}

	

