package tesi.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.javadocmd.simplelatlng.LatLng;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import tesi.model.TesiModel;

public class PannelloCalcoloPercorsoController {

	private TesiModel model;
	private Stage primaryStage;
	private Stage itself;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private ImageView btnHome;


    @FXML
    private TextField txtAutonomiaScelta;

    @FXML
    private ChoiceBox<String> boxCittaPartenza;

    @FXML
    private TextField txtLatPartenza;

    @FXML
    private TextField txtLongPartenza;

    @FXML
    private ChoiceBox<String> boxCittaArrivo;

    @FXML
    private TextField txtLatArrivo;

    @FXML
    private TextField txtLongArrivo;
    
    @FXML
    private RadioButton checkPercorsoVeloce;

    @FXML
    private RadioButton checkColonnineFast;

    @FXML
    private Button btnCalcolaPercorso;

    @FXML
    private Button btnResetPercorso;

    @FXML
    private TextArea txtResult;

    @FXML
    void doBackHome(MouseEvent event) {

    	try {
        	primaryStage=new Stage();
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("PannelloIniziale.fxml"));
    		BorderPane root = (BorderPane) loader.load();
    		
    		Scene scene=new Scene(root);
    		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    		
    		PannelloInizialeController controller=loader.getController();
    		TesiModel model=new TesiModel();
    		controller.setModel(model);
    		
    		primaryStage.setScene(scene);
    		primaryStage.show();
    		controller.setItself(primaryStage);
    		itself.close();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}



    }

    @FXML
    void doCalcolaPercorso(ActionEvent event) {
    	/*if(this.txtAutonomiaScelta.getText()!=null) {
    		//crei grafo ponderato su distanza massima colonnine
    		System.out.println(txtAutonomiaScelta.getText());
    	}*/
    	String partenza=this.boxCittaPartenza.getValue();
    	String arrivo=this.boxCittaArrivo.getValue();
    	txtResult.appendText(""+this.model.distanzaPunti(new LatLng(Float.parseFloat(this.txtLatPartenza.getText()), Float.parseFloat(this.txtLongPartenza.getText())),new LatLng(Float.parseFloat(this.txtLatArrivo.getText()), Float.parseFloat(this.txtLongArrivo.getText())))+" km\n"); 
    	this.model.creaGrafo(partenza,arrivo);
    	txtResult.appendText(model.getReteStazioni().toString());
    	
    	
    }

    @FXML
    void doResetPercorso(ActionEvent event) {
    	this.txtResult.clear();
    	this.boxCittaArrivo.setValue(null);
    	this.boxCittaPartenza.setValue(null);
    	this.txtLatArrivo.clear();
    	this.txtLatPartenza.clear();
    	this.txtLongArrivo.clear();
    	this.txtLongPartenza.clear();
    	this.checkColonnineFast.selectedProperty().set(false);
    	this.checkPercorsoVeloce.selectedProperty().set(false);
    }

    @FXML
    void generaCoordinateArrivo(MouseEvent event) {
    	if(!this.boxCittaArrivo.getSelectionModel().isEmpty()) {
    	String arrivo=this.boxCittaArrivo.getValue();
    	this.txtLatArrivo.setText(this.model.getLatitudine(arrivo));
    	this.txtLongArrivo.setText(this.model.getLongitudine(arrivo));
    	}
    	
    }

    @FXML
    void generaCoordinatePartenza(MouseEvent event) {
    	if(!this.boxCittaPartenza.getSelectionModel().isEmpty()) {
    	String partenza=this.boxCittaPartenza.getValue();
    	this.txtLatPartenza.setText(this.model.getLatitudine(partenza));
    	this.txtLongPartenza.setText(this.model.getLongitudine(partenza));
    	}
    	
    }

    @FXML
    void initialize() {
    	 assert btnHome != null : "fx:id=\"btnHome\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert txtAutonomiaScelta != null : "fx:id=\"txtAutonomiaScelta\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert boxCittaPartenza != null : "fx:id=\"boxCittaPartenza\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert txtLatPartenza != null : "fx:id=\"txtLatPartenza\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert txtLongPartenza != null : "fx:id=\"txtLongPartenza\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert boxCittaArrivo != null : "fx:id=\"boxCittaArrivo\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert txtLatArrivo != null : "fx:id=\"txtLatArrivo\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert txtLongArrivo != null : "fx:id=\"txtLongArrivo\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert checkPercorsoVeloce != null : "fx:id=\"checkPercorsoVeloce\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert checkColonnineFast != null : "fx:id=\"checkColonnineFast\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert btnCalcolaPercorso != null : "fx:id=\"btnCalcolaPercorso\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert btnResetPercorso != null : "fx:id=\"btnResetPercorso\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'PannelloCalcoloPercorso.fxml'.";

    }

	public void setModel(TesiModel model) {
		this.model = model;
		this.boxCittaPartenza.getItems().addAll(this.model.getCitta());
		this.boxCittaArrivo.getItems().addAll(this.model.getCitta());
	}

	public void setItself(Stage itself) {
		this.itself = itself;
	}
    
	
}
