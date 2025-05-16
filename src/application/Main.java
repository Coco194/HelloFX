package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}
 
	@Override
	public void start(Stage primarystage) throws Exception {
		
		// stage is similar to Jframe
		Stage stage = new Stage();
		
		Group root = new Group();
		
		// scene is similar to JPanel
		Scene scene = new Scene(root, Color.AZURE);
	
		Text text = new Text();
		text.setText("HELLO");
		text.setY(100);
		text.setX(100);
		text.setFont(Font.font("Verdana", 50));
		
		
		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(500);
		line.setEndY(200);
		
		Circle circle = new Circle();
		circle.setCenterX(200);
		circle.setCenterY(200);
		circle.setRadius(40);
		circle.setFill(Color.BROWN);
		
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(circle);
		
		stage.setTitle("javaFX project");
		
		stage.setWidth(420);
		stage.setHeight(420);
		
		stage.setScene(scene);
		stage.show();
	}
}
