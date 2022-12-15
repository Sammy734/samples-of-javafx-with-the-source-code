package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {

	@FXML
	Label mylabel;
	
	public void DisplyName(String username){
		mylabel.setText("HELLO"+ username);
	}
	
}
