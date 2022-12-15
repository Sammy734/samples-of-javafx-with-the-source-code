package com.application.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ImageOneContloller {

	@FXML
	private Label myLabel;

	@FXML
	private TextField myText;

	@FXML
	private Button myButton;

	int age;

	public void submmit(ActionEvent event){

		age = Integer.parseInt(myText.getText());


		try{
			if(age >=18){
				myLabel.setText("you are now singed upand feal welcomed");
			}
			else{
				myLabel.setText("You are under 18 years");
			}

		}
		catch(NumberFormatException e){
			System.out.println("Enter Numbers Only please");

		}
		catch(Exception e){
			System.out.println(e);
		}

	}



}
