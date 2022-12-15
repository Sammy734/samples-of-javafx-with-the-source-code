package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene1Controller {

	@FXML
	private Button logoutbutton;
	@FXML
	private AnchorPane ScenePane;

	Stage stage;

	public void Logout(ActionEvent event){
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("LOGOUT");
		alert.setHeaderText("YOU ARE ABOUT TO LOGOUT !!!!");
		alert.setContentText("DO YOU WANT TO SAVE BEFORE EXITING?:");
		
		if(alert.showAndWait().get() == ButtonType.OK){
		
		stage = (Stage) ScenePane.getScene().getWindow();
		System.out.println("you have succefully logout");
		stage.close();
		}
	}

}
