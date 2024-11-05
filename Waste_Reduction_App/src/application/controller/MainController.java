package application.controller;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;

import javafx.scene.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainController {
    @FXML public HBox mainBox;
	
	private FXMLLoader currentLoader;
	private FXMLLoader previousLoader;
	private AnchorPane currentPane;
	private AnchorPane previousPane;
	
	public FXMLLoader getCurrentLoader() {
		return currentLoader;
	}
	
	public void setCurrentLoader(FXMLLoader loader) {
		currentLoader = loader;
	}
	
	public AnchorPane getCurrentPane() {
		return currentPane;
	}
	
	public void setCurrentPane(AnchorPane pane) {
		currentPane = pane;
	}
	
	public FXMLLoader getPrevLoader() {
		return previousLoader;
	}
	
	public void setPrevLoader(FXMLLoader loader) {
		previousLoader = loader;
	}
	
	public AnchorPane getPrevPane() {
		return previousPane;
	}
	
	public void setPrevPane(AnchorPane pane) {
		previousPane = pane;
	}
	
	@FXML
	public void initialize() {
	}

	@FXML
	public void handleGreenGuidesButton(javafx.event.ActionEvent actionEvent) {
		try {
			// Load the new FXML file for the "Green Guides" scene
			FXMLLoader guides_loader = new FXMLLoader(getClass().getClassLoader().getResource("view/GreenGuides.fxml"));
			Parent newRoot = guides_loader.load();

			// Get the current stage (window) and set the new scene
			Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
			Scene scene = new Scene(newRoot);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
