package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SampleController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchTosample(ActionEvent event){
		try {
			 root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public void switchTosample2(ActionEvent event){
		
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("Sample2.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
