package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
			try {
				   Parent root = FXMLLoader.load(getClass().getResource("StartPageGUI.fxml"));
				   Scene scene = new Scene(root);
				   scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				   stage.setScene(scene);
				   stage.setTitle("MindForge");
				   stage.getIcons().add(new Image("file:Mind_Forge_Logo-New.png"));
				   stage.show();
				}
				catch(Exception e)
				{
					e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

