package application.controller;
import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

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
}
