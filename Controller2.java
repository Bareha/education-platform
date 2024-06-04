package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller2 {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private TextField usernameField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Button loginButton;
	@FXML
	private Button registerButton;
	@FXML
	private Label messageLabel;
	@FXML
	private MenuItem exitItem;
	@FXML
	private AnchorPane scenePane;
	
	public void register(ActionEvent event) {
		String username = usernameField.getText();
		String password = passwordField.getText();
		if (username.isEmpty() || password.isEmpty()) {
		    messageLabel.setText("Enter both username and password.");
		    return;
		} else {
		if(!authenticate(username, password)) {
			try {
				FileWriter writer = new FileWriter("AccountDatabase.txt", true);
				writer.write(username + " " + password + "\n");
				writer.close();
				}
			catch (IOException e) {
					e.printStackTrace();
			}
		} else {
			messageLabel.setText("User already registered.");
		}
	}
}
	
	public void login(ActionEvent event) throws IOException {
		String username = usernameField.getText();
		String password = passwordField.getText();
		if (authenticate(username, password)) {
			root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} else if (!authenticate(username, password)) {
			messageLabel.setText("Invalid username or password.");
		}
	}
	
	public boolean authenticate(String username, String password) {
        boolean userValid = false;
        try {
        	BufferedReader reader = new BufferedReader(new FileReader("AccountDatabase.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(username + " " + password)) {
                    userValid = true;
                    break;
                }
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        }
        return userValid;
	}
	
	public void exit(ActionEvent event) {
		stage = (Stage) scenePane.getScene().getWindow();
		stage.close();
	}
	public void tellAbout(ActionEvent event){
		JOptionPane.showMessageDialog(null, "MindForge is an education platform created by Arushi & Bareha.");
	}
}