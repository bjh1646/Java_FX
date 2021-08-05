package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			*/
			
			HBox hbox = new HBox();
			hbox.setPadding(new Insets(10, 10, 10, 10));
			hbox.setSpacing(10);
			
			TextField textField = new TextField();
			textField.setPrefWidth(200);
			
			Button button = new Button();
			button.setText("확인");
			button.setOnAction(event->Platform.exit());
			
			ObservableList list = hbox.getChildren();
			list.add(textField);
			list.add(button);
			
			Scene scene = new Scene(hbox);
			
			primaryStage.setTitle("AppMain");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
