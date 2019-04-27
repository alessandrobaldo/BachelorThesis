package tesi.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import tesi.model.AutoElettriche;
import tesi.model.TesiModel;

public class TesiController {

	private TesiModel model;
	private List<AutoElettriche> auto;
	
	
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private VBox boxLogo;

    
    @FXML
    private VBox pannello;

    @FXML
    private CheckBox checkCompro;

    @FXML
    private CheckBox checkNoleggio;

    @FXML
    private ChoiceBox<String> tendinaMarca;

    @FXML
    private ChoiceBox<String> tendinaModello;

    @FXML
    private ChoiceBox<String> tendinaSegmento;

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
    private ChoiceBox<Integer> tendinaNumPosti;

    @FXML
    private CheckBox checkTrazione;

    @FXML
    private CheckBox checkRicarica;
    
    @FXML
    private Button btnResetAuto;
    
    @FXML
    private Button btnRisultatiAuto;

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
    private ChoiceBox<String> boxCittaPartenza;

    @FXML
    private ChoiceBox<String> boxCittaArrivo;


    @FXML
    private ImageView hamburgerMenu;
    
    
    
  //PARTE 1: ANALISI AUTO
    @FXML
    void checkSelectedMarca(MouseEvent event) {
		this.tendinaMarca.getItems().addAll(this.model.getMarche());

    	if(!this.tendinaMarca.getSelectionModel().isEmpty()) {
    		this.tendinaModello.getItems().clear();
    		this.tendinaModello.getItems().addAll(this.model.getModelloByMarca(tendinaMarca.getValue()));
    	}
    }

    @FXML
    void checkSelectedModello(MouseEvent event) {
    	if(!this.tendinaModello.getSelectionModel().isEmpty()) {
    	this.tendinaMarca.setDisable(true);
    	this.tendinaNumPosti.setDisable(true);
    	this.sliderAutonomia.setDisable(true);
    	this.sliderNoleggio.setDisable(true);
    	this.sliderPrezzo.setDisable(true);
    	this.sliderPrestazioni.setDisable(true);
    	this.sliderVelocita.setDisable(true);
    	this.checkRicarica.setDisable(true);
    	this.checkTrazione.setDisable(true);
    	this.tendinaSegmento.setDisable(true);}
	
    }

   
    
    @FXML
    void doCompro(ActionEvent event) {
    	if(this.checkCompro.isSelected()) {
    		this.checkNoleggio.setDisable(true);
    		this.sliderNoleggio.setDisable(true);
    	}
    	
    	else {
    		this.checkNoleggio.setDisable(false);
    		this.sliderNoleggio.setDisable(false);
    	}

    }
    
    @FXML
    void doNoleggio(ActionEvent event) {
    	if(this.checkNoleggio.isSelected()) {
    		this.checkCompro.setDisable(true);
    		this.sliderPrezzo.setDisable(true);
    	}
    	else {
    		this.checkCompro.setDisable(false);
    		this.sliderPrezzo.setDisable(false);
    	}

    }


   
    @FXML
    void doResetAuto(ActionEvent event) {
    	txtResult.clear();
    	this.checkCompro.selectedProperty().set(false);
    	this.checkCompro.setDisable(false);
    	this.checkNoleggio.selectedProperty().set(false);
    	this.checkNoleggio.setDisable(false);
    	this.tendinaModello.setValue(null);
    	this.tendinaModello.setDisable(false);
    	this.tendinaMarca.setValue(null);
		this.tendinaMarca.setDisable(false);
		this.tendinaNumPosti.setValue(null);
		this.tendinaNumPosti.setDisable(false);
		this.tendinaSegmento.setValue(null);
		this.tendinaSegmento.setDisable(false);
		this.sliderPrezzo.setValue(0);
		this.sliderPrezzo.setDisable(false);
		this.sliderAutonomia.setValue(0);
		this.sliderAutonomia.setDisable(false);
		this.sliderNoleggio.setValue(0);
		this.sliderNoleggio.setDisable(false);
		this.sliderVelocita.setValue(0);
		this.sliderVelocita.setDisable(false);
		this.sliderPrestazioni.setValue(0);
		this.sliderPrestazioni.setDisable(false);
		this.checkRicarica.selectedProperty().set(false);
		this.checkRicarica.setDisable(false);
		this.checkTrazione.selectedProperty().set(false);
		this.checkTrazione.setDisable(false);

    	

    
    }

   
    
    
    @FXML
    void doTrovaRisultati(ActionEvent event) {
    	txtResult.clear();
    	if(this.tendinaModello.getValue()!=null) {
    		this.txtResult.appendText("Auto scelta: "+this.model.getAutoByModello(tendinaModello.getValue()).toString()+"\n");;
    		return;
    	}
    	
    	List<AutoElettriche> desiderate=new ArrayList<>();
    	
    	for(AutoElettriche a:this.auto) {
    		int trovato=0;
        	int parametri=0;
    		if(!this.tendinaMarca.getSelectionModel().isEmpty()) {
    			parametri++;
    			//System.out.println(this.tendinaMarca.getValue());
    			if(a.getMarca().equals(this.tendinaMarca.getValue()))
    				trovato++;
    			else
    				trovato=0;
    		}
    		if(!this.tendinaSegmento.getSelectionModel().isEmpty()) {
    			parametri++;
    			//System.out.println(this.tendinaSegmento.getValue());
    			if(a.getSegmento().equals(this.tendinaSegmento.getValue()))
    				trovato++;
    			else
    				trovato=0;
    		}
    		if((int)this.sliderPrezzo.getValue()!=sliderPrezzo.getMin() && !this.sliderPrezzo.isDisable()) {
    			parametri++;
    			//System.out.println(this.sliderPrezzo.getValue());
    			if(a.getPrezzoVendita()<=this.sliderPrezzo.getValue())
    				trovato++;
    			else 
    				trovato=0;	
    		}
    		
    		if(this.sliderNoleggio.getValue()!=sliderNoleggio.getMin() && !this.sliderNoleggio.isDisable()) {
    			parametri++;
    			if(a.getPrezzoNoleggio()<=this.sliderNoleggio.getValue())
    				trovato++;
    			else
    				trovato=0;
    		}
    		
    		if(this.sliderAutonomia.getValue()!=sliderAutonomia.getMin()) {
    			parametri++;
    			if(a.getAutonomia()<=this.sliderAutonomia.getValue())
    				trovato++;
    			else
    				trovato=0;
    		}
    		
    		if(this.sliderPrestazioni.getValue()!=sliderPrestazioni.getMin()) {
    			parametri++;
    			if(a.getPrestazioni()<=this.sliderPrestazioni.getValue())
    				trovato++;
    			else
    				trovato=0;
    		}
    		
    		if(this.sliderVelocita.getValue()!=this.sliderVelocita.getMin()) {
    			parametri++;
    			if(a.getVelocitaMax()<=this.sliderVelocita.getValue())
    				trovato++;
    			else
    				trovato=0;
    		}
    		
    		if(!this.tendinaNumPosti.getSelectionModel().isEmpty()) {
    			parametri++;
    			if(a.getNumeroPosti()==this.tendinaNumPosti.getValue())
    				trovato++;
    			else
    				trovato=0;
    		}
    		
    		if(this.checkTrazione.isSelected()) {
    			parametri++;
    			if(a.isTrazioneIntegrale()==true)
    				trovato++;
    			else
    				trovato=0;
    		}
    		
    		if(this.checkRicarica.isSelected()) {
    			parametri++;
    			if(a.isRicaricaRapida()==true)
    				trovato++;
    			else
    				trovato=0;
    		}
    		
    		
    		//Controllo che trovato abbia lo stesso valore di parametri
    		if(trovato==parametri)
    			desiderate.add(a);
    			
    	}
    	
    	
    	if(desiderate.size()==0)
    		txtResult.appendText("Siamo dispiaciuti, nessuna auto soddisfa le sue preferenze\n");
    	else
    		for(AutoElettriche a:desiderate)
    			txtResult.appendText(a.toString()+"\n");
    	
    	
    }

    @FXML
    void showPannello(MouseEvent event) {
    	if(this.pannello.isVisible()) {
    		this.pannello.setVisible(false);
    		return;}
    	else {
    		this.pannello.setVisible(true);
    		return;
    	}

    }
    
    //PARTE 2: CALCOLO DEL PERCORSO
    @FXML
    void doCalcolaPercorso(ActionEvent event) {

    	
    	
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
    void doResetPartenza(ActionEvent event) {
    	
    	this.boxCittaPartenza.setValue(null);
    	this.txtLatPartenza.clear();
    	this.txtLongPartenza.clear();
    }
    
    @FXML
    void doResetArrivo(ActionEvent event) {
    	this.boxCittaArrivo.setValue(null);
    	this.txtLatArrivo.clear();
    	this.txtLongArrivo.clear();

    }


    @FXML
    void initialize() {
    	assert boxLogo != null : "fx:id=\"boxLogo\" was not injected: check your FXML file 'Tesi.fxml'.";
    	assert pannello != null : "fx:id=\"pannello\" was not injected: check your FXML file 'Tesi.fxml'.";
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
        assert btnResetAuto != null : "fx:id=\"btnResetAuto\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert btnRisultatiAuto != null : "fx:id=\"btnRisultatiAuto\" was not injected: check your FXML file 'Tesi.fxml'.";
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
        assert boxCittaPartenza != null : "fx:id=\"boxCittaPartenza\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert boxCittaArrivo != null : "fx:id=\"boxCittaArrivo\" was not injected: check your FXML file 'Tesi.fxml'.";
        assert hamburgerMenu != null : "fx:id=\"hamburgerMenu\" was not injected: check your FXML file 'Tesi.fxml'.";

    }

	public void setModel(TesiModel model) {
		this.model = model;
		WebEngine engine=this.webView.getEngine();
		//engine.load("https://www.openstreetmap.org/#map=5/32.454/-113.687&layers=G");
		engine.load("file:/Users/alebaldus/Desktop/Politecnico/Tecniche%20di%20Programmazione/Eclipse/Tesi/html/WebViewCalifornia.html");

		this.tendinaMarca.getItems().addAll(this.model.getMarche());
		this.tendinaModello.getItems().addAll(this.model.getModelli());
		this.tendinaNumPosti.getItems().addAll(this.model.getNumPosti());
		this.tendinaSegmento.getItems().addAll(this.model.getSegmenti());
		this.auto=this.model.getAllAuto();
		Image i=new Image("file:/Users/alebaldus/Desktop/Politecnico/Tecniche%20di%20Programmazione/Eclipse/Tesi/img/logoTesi.jpg");
		this.boxLogo.setBackground(new Background(new BackgroundImage(i,BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		this.boxCittaPartenza.getItems().addAll(this.model.getCitta());
		this.boxCittaArrivo.getItems().addAll(this.model.getCitta());

	}
}
