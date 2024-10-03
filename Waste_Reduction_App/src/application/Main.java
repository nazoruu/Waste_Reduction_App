package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        try{
        	FXMLLoader mainLoader = new FXMLLoader(getClass().getClassLoader().getResource("view/Main.fxml"));
			HBox mainBox = (HBox)mainLoader.load();
			Scene scene = new Scene(mainBox);
			scene.getStylesheets().add(getClass().getClassLoader().getResource("css/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
            
        }catch(Exception e) {
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		launch(args);
	 }
    
}
