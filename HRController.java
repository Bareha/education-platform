package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HRController implements Initializable {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Parent root1;
	private Parent root2;
	String test = "false";

	@FXML
	private MediaView mediaView;
	@FXML
	private Button playButton,pauseButton,resetButton;
	@FXML
	private Button purchase , quiz, assignment;
	@FXML
	private MenuButton Lectures;
	private File file;
	private Media media;
	private MediaPlayer mediaPlayer;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		file = new File("HRLecture1.mp4");
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		
	}
	public void switchToLecture1(ActionEvent event)throws IOException
	{
		    mediaPlayer.pause();
			file = new File("HRLecture1.mp4");
			media = new Media(file.toURI().toString());
			mediaPlayer = new MediaPlayer(media);
			mediaView.setMediaPlayer(mediaPlayer);
		    
	}
	public void switchToLecture2(ActionEvent event)throws IOException
	{
		    mediaPlayer.pause();
			file = new File("HRLecture2.mp4");
			media = new Media(file.toURI().toString());
			mediaPlayer = new MediaPlayer(media);
			mediaView.setMediaPlayer(mediaPlayer);
		    
	}
	public void switchToLecture3(ActionEvent event)throws IOException
	{
		    mediaPlayer.pause();
			file = new File("HRLecture3.mp4");
			media = new Media(file.toURI().toString());
			mediaPlayer = new MediaPlayer(media);
			mediaView.setMediaPlayer(mediaPlayer);
		    
	}
	public void playMedia()
	{
		mediaPlayer.play();
	}
	public void pauseMedia()
	{
		mediaPlayer.pause();
	}
	public void resetMedia()
	{
		mediaPlayer.seek(Duration.seconds(0.0));
	}
	
	public void switchToQuiz(ActionEvent event) throws IOException{
		
		root1 = FXMLLoader.load(getClass().getResource("HRQuiz.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root1);
        stage.setScene(scene);
        stage.show();
	}
	public void switchToAssignment(ActionEvent event)throws IOException{
		
		root2 = FXMLLoader.load(getClass().getResource("HRAssignment.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root2);
        stage.setScene(scene);
        stage.show();

	}
	public void switchToPayment(ActionEvent event)throws IOException{
		if (authenticate()) {
			playButton.setDisable(false);
			pauseButton.setDisable(false);
			resetButton.setDisable(false);
			quiz.setDisable(false);
			assignment.setDisable(false);
			Lectures.setDisable(false);
			} 
		else {
			root = FXMLLoader.load(getClass().getResource("PaymentGUI3.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			}

	}
	
	public boolean authenticate() {
        boolean flag = false;
        try {
        	BufferedReader reader = new BufferedReader(new FileReader("PaymentDatabase3.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals("true")) {
                    flag = true;
                    break;
                }
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        }
        return flag;
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