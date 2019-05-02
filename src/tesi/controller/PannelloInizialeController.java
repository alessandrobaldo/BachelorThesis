package tesi.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import tesi.model.TesiModel;

public class PannelloInizialeController {

	TesiModel model;
	Stage secondaryStage;
	Stage tertiaryStage;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnScegliAuto;

    @FXML
    private Button btnCalcolaPercorso;

    @FXML
    void showScegliAuto(ActionEvent event) {
    	try {
    	secondaryStage=new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("PannelloSceltaAuto.fxml"));
		BorderPane root = (BorderPane) loader.load();
		
		Scene scene=new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		PannelloSceltaAutoController controller=loader.getController();
		TesiModel model=new TesiModel();
		controller.setModel(model);
		
		secondaryStage.setScene(scene);
		secondaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}

    }

    @FXML
    void showScegliPercorso(ActionEvent event) {

    	try {
        	tertiaryStage=new Stage();
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("PannelloCalcoloPercorso.fxml"));
    		BorderPane root = (BorderPane) loader.load();
    		
    		Scene scene=new Scene(root);
    		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    		
    		PannelloCalcoloPercorsoController controller=loader.getController();
    		TesiModel model=new TesiModel();
    		controller.setModel(model);
    		
    		tertiaryStage.setScene(scene);
    		tertiaryStage.show();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    @FXML
    void initialize() {
        assert btnScegliAuto != null : "fx:id=\"btnScegliAuto\" was not injected: check your FXML file 'PannelloIniziale.fxml'.";
        assert btnCalcolaPercorso != null : "fx:id=\"btnCalcolaPercorso\" was not injected: check your FXML file 'PannelloIniziale.fxml'.";

    }

	public void setModel(TesiModel model) {
		this.model = model;
	}
    
    
}
