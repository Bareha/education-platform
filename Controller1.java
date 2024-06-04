package application;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller1 {
	@FXML
	private CheckBox captcha;
	@FXML
	private Label captchaWarning;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void getStarted(ActionEvent event) throws IOException {
	    if (captcha.isSelected()) {
	        root = FXMLLoader.load(getClass().getResource("LoginGUI.fxml"));
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	    } else {
	        captchaWarning.setText("Please prove you are not a robot.");
	    }
	}
}