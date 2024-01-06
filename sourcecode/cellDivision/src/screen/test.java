package screen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class test extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Tạo một đoạn văn bản đa dòng
        Text multilineText = new Text("Line 1\nLine 2\nLine 3");
        multilineText.setFont(new Font(14)); // Đặt kích thước font

        // Tạo StackPane và thêm đoạn văn bản vào đó
        StackPane root = new StackPane();
        root.getChildren().add(multilineText);

        // Tạo Scene và đặt nó trong Stage
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Text Example");
        primaryStage.setScene(scene);

        // Hiển thị Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
