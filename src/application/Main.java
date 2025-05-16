package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		
		Scene scene = new Scene(root, Color.AZURE);
		
		stage.setTitle("javaFX project");
		
		stage.setWidth(420);
		stage.setHeight(420);

		stage.setFullScreen(true);
		stage.setFullScreenExitHint("You cannot escape unless you press exit");
		
		stage.setScene(scene);
		stage.show();
	}
}
