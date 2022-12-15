package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage Stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage.setScene(scene);
			Stage.setTitle("THIS IS A LOGOUT EXAMPLE");
			Stage.show();
			Stage.setOnCloseRequest(event ->{ 
				event.consume();
			Logout(Stage);
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
public void Logout(Stage stage){
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("LOGOUT");
		alert.setHeaderText("YOU ARE ABOUT TO LOGOUT !!!!");
		alert.setContentText("DO YOU WANT TO SAVE BEFORE EXITING?:");
		
		if(alert.showAndWait().get() == ButtonType.OK){
		
		
		System.out.println("you have succefully logout");
		stage.close();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
