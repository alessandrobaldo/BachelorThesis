package tesi.controller;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import tesi.model.TesiModel;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			System.out.println(getClass().getResource("Tesi.fxml"));
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Tesi.fxml"));
			//loader.setRoot(getClass().getResource("/Users/alebaldus/Desktop/Politecnico/Tecniche%20di%20Programmazione/Eclipse/Tesi/bin/tesi/controller/Tesi.fxml"));
			BorderPane root = (BorderPane) loader.load();
			
			Scene scene=new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			TesiController controller=loader.getController();
			TesiModel model=new TesiModel();
			controller.setModel(model);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
