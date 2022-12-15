package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Scene1Controller {

	@FXML
	ImageView myimageview;
	Button mybutton;

	Image myimage = new Image(getClass().getResourceAsStream("smartfx.jepg.jepg"));

	public void DisplayImage(){
		myimageview.setImage(myimage);
	}

}
