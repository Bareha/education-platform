package application;
import java.io.FileWriter;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PaymentController3 {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private AnchorPane scenePane;
	@FXML
	private TextField cardNameField;
	@FXML
	private TextField cardNumberField;
	@FXML
	private PasswordField cvvField;
	@FXML
	private DatePicker dateExpiry;
	@FXML
	private Label confirmWarning;
	@FXML
	private Button confirmButton;
	

    
    
	public boolean checkValid() {
	    String cardNumber = cardNumberField.getText();
	    String cvv = cvvField.getText();
	    
	    boolean isValid = true;

	    if (!cardNumber.matches("[0-9]+") || cardNumber.length() != 16) {
	        isValid = false;
	    } else {
	        long number = Long.parseLong(cardNumber);
	        if (number < 1000000000000000L || number > 9999999999999999L) {
	            isValid = false;
	        }
	    }

	    if (!cvv.matches("[0-9]+") || cvv.length() != 3) {
	        isValid = false;
	    }

	    return isValid;
	}
	
	public void confirm(ActionEvent event) throws IOException {
		if(checkValid()) {
			{
				try {
					FileWriter writer = new FileWriter("PaymentDatabase3.txt", true);
					writer.write("true");
					writer.close();
					}
				catch (IOException e) {
						e.printStackTrace();
				}
			}
			root = FXMLLoader.load(getClass().getResource("HumanResource.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} else {
			confirmWarning.setText("Invalid entry found: Re-check your entries");
		}
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
