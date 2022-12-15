package com.test;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	  @Override
	    public void start(Stage primaryStage) throws Exception{
	        Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
	        primaryStage.setTitle("Gatumaini pry");
	        primaryStage.getIcons().add(new Image("/home/icons/icon.png"));
	        primaryStage.setScene(new Scene(root));
	        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
