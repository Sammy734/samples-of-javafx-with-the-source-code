package example.com;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Scene1Controller {
	@FXML
	private Label mylabel;
	@FXML
	private TextField mytextfield;
	@FXML
	private Button btnsubmit;

	int age;

	public void Submit(ActionEvent event){

		try{
		age = Integer.parseInt(mytextfield.getText());
		if(age >=18){
			mylabel.setText("YOU ARE NOW SIGNED UP!");
		}else{
			mylabel.setText("YOU MUST BE ABOVE 18+");
		}
		}
	catch(NumberFormatException e){
		mylabel.setText("ENTER ONLY NUMBERS PLEASE!!!!");
		}
	catch(Exception e){
			mylabel.setText("ERROR");
		}
	}

}
