package tesi.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;
import tesi.model.TesiModel;

public class TesiController {

	TesiModel model;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView hamburgerMenu;

    @FXML
    private CheckBox checkCompro;

    @FXML
    private CheckBox checkNoleggio;

    @FXML
    private ChoiceBox<?> tendinaMarca;

    @FXML
    private ChoiceBox<?> tendinaModello;

    @FXML
    private ChoiceBox<?> tendinaSegmento;

    @FXML
    private Slider sliderPrezzo;

    @FXML
    private Slider sliderNoleggio;

    @FXML
    private Slider sliderAutonomia;

    @FXML
    private Slider sliderPrestazioni;

    @FXML
    private Slider sliderVelocita;

    @FXML
    private ChoiceBox<?> tendinaNumPosti;

    @FXML
    private CheckBox checkTrazione;

    @FXML
    private CheckBox checkRicarica;

    @FXML
    private TextField txtLatPartenza;

    @FXML
    private TextField txtLongPartenza;

    @FXML
    private TextField txtLatArrivo;

    @FXML
    private TextField txtLongArrivo;

    @FXML
    private Button btnResetPartenza;

    @FXML
    private Button btnResetArrivo;

    @FXML
    private RadioButton checkPercorsoVeloce;

    @FXML
    private RadioButton checkMaxCitta;

    @FXML
    private RadioButton checkColonnineFast;

    @FXML
    private WebView webView;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnCalcolaPercorso;

    @FXML
    private TextField txtCittaPartenza;

    @FXML
    private TextField txtCittaArrivo;

    @FXML
    void doCalcolaPercorso(ActionEvent event) {

    }

    @FXML
    void doResetArrivo(ActionEvent event) {

    }

    @FXML
    void doResetPartenza(ActionEvent event) {

    }

    @FXML
    void showPannello(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert hamburgerMenu != null : "fx:id=\"hamburgerMenu\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert checkCompro != null : "fx:id=\"checkCompro\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert checkNoleggio != null : "fx:id=\"checkNoleggio\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert tendinaMarca != null : "fx:id=\"tendinaMarca\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert tendinaModello != null : "fx:id=\"tendinaModello\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert tendinaSegmento != null : "fx:id=\"tendinaSegmento\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert sliderPrezzo != null : "fx:id=\"sliderPrezzo\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert sliderNoleggio != null : "fx:id=\"sliderNoleggio\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert sliderAutonomia != null : "fx:id=\"sliderAutonomia\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert sliderPrestazioni != null : "fx:id=\"sliderPrestazioni\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert sliderVelocita != null : "fx:id=\"sliderVelocita\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert tendinaNumPosti != null : "fx:id=\"tendinaNumPosti\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert checkTrazione != null : "fx:id=\"checkTrazione\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert checkRicarica != null : "fx:id=\"checkRicarica\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert txtLatPartenza != null : "fx:id=\"txtLatPartenza\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert txtLongPartenza != null : "fx:id=\"txtLongPartenza\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert txtLatArrivo != null : "fx:id=\"txtLatArrivo\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert txtLongArrivo != null : "fx:id=\"txtLongArrivo\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert btnResetPartenza != null : "fx:id=\"btnResetPartenza\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert btnResetArrivo != null : "fx:id=\"btnResetArrivo\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert checkPercorsoVeloce != null : "fx:id=\"checkPercorsoVeloce\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert checkMaxCitta != null : "fx:id=\"checkMaxCitta\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert checkColonnineFast != null : "fx:id=\"checkColonnineFast\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert webView != null : "fx:id=\"webView\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert btnCalcolaPercorso != null : "fx:id=\"btnCalcolaPercorso\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert txtCittaPartenza != null : "fx:id=\"txtCittaPartenza\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert txtCittaArrivo != null : "fx:id=\"txtCittaArrivo\" was not injected: check your FXML file 'Tesi.fxml'.";

    }

	public void setModel(TesiModel model) {
		// TODO Auto-generated method stub
		this.model=model;
	}
}
