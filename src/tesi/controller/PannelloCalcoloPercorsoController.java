package tesi.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import tesi.model.TesiModel;

public class PannelloCalcoloPercorsoController {

	TesiModel model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    void doCalcolaPercorso(ActionEvent event) {

    	this.model.creaGrafo();
    	txtResult.appendText(model.getReteStazioni().toString());
    	
    	
    }

    @FXML
    void doResetPercorso(ActionEvent event) {

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
    
}
