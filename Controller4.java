package application;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller4 {
	private Scene scene;
	private Stage stage;
	@FXML
	private Label scoreLabel;
	@FXML
	private AnchorPane scenePane;
	int score = 0;
	public void correct(ActionEvent e) {
		score += 1;
	}
	public void incorrect(ActionEvent e) {
		score += 0;
	}
	public void done(ActionEvent e) {
		scoreLabel.setText(score*20 + "%");
	}
	public void switchToDM(ActionEvent event ) throws IOException
	{
		Parent root1 = FXMLLoader.load(getClass().getResource("DigitalMarketing.fxml"));
        stage = (Stage)((MenuItem)event.getSource()).getParentPopup().getOwnerWindow();
        scene = new Scene(root1);
        stage.setScene(scene);
        stage.show();
	}
	public void switchToBR(ActionEvent event ) throws IOException
	{
		Parent root2 = FXMLLoader.load(getClass().getResource("Branding.fxml"));
        stage = (Stage)((MenuItem)event.getSource()).getParentPopup().getOwnerWindow();
        scene = new Scene(root2);
        stage.setScene(scene);
        stage.show();
	}
    public void switchToSS(ActionEvent event ) throws IOException
	{
		Parent root3 = FXMLLoader.load(getClass().getResource("Sales.fxml"));
        stage = (Stage)((MenuItem)event.getSource()).getParentPopup().getOwnerWindow();
        scene = new Scene(root3);
        stage.setScene(scene);
        stage.show();
	}
    public void switchToHR(ActionEvent event ) throws IOException
	{
		Parent root4 = FXMLLoader.load(getClass().getResource("HumanResource.fxml"));
        stage = (Stage)((MenuItem)event.getSource()).getParentPopup().getOwnerWindow();
        scene = new Scene(root4);
        stage.setScene(scene);
        stage.show();
	}
    public void switchToWD(ActionEvent event ) throws IOException
	{
		Parent root5 = FXMLLoader.load(getClass().getResource("WebDev.fxml"));
        stage = (Stage)((MenuItem)event.getSource()).getParentPopup().getOwnerWindow();
        scene = new Scene(root5);
        stage.setScene(scene);
        stage.show();
	}
    public void switchToHome(ActionEvent event ) throws IOException
	{
		Parent root6 = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((MenuItem)event.getSource()).getParentPopup().getOwnerWindow();
        scene = new Scene(root6);
        stage.setScene(scene);
        stage.show();
	}
    public void switchToLogin(ActionEvent event) throws IOException {
		Parent root7 = FXMLLoader.load(getClass().getResource("LoginGUI.fxml"));
	    stage = (Stage)((MenuItem)event.getSource()).getParentPopup().getOwnerWindow();
	    scene = new Scene(root7);
	    stage.setScene(scene);
	    stage.show();
	}
}