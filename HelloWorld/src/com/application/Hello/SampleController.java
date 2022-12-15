package com.application.Hello;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class SampleController {
	@FXML
	ImageView myImageView;
	Button myButton;

	Image myImage = new Image(getClass().getResourceAsStream("image 2.jpg"));

	public void dispalyImage(){
		myImageView.setImage(myImage);
	}


}
