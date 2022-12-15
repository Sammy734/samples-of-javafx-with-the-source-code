package example.com;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Scene1Controller {
	@FXML
	private Label mylabel;
	@FXML
	private RadioButton rbutton1,rbutton2,rbutton3;

	public void Getfood(ActionEvent event){

		if(rbutton1.isSelected()){
			mylabel.setText(rbutton1.getText());

		}else if(rbutton2.isSelected()){
			mylabel.setText(rbutton2.getText());

		}else if(rbutton3.isSelected()){
			mylabel.setText(rbutton3.getText());
		}
	}
}
