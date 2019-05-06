package tesi.model;

public class AutoElettriche {
	
	private String marca;
	private String modello;
	private int prezzoVendita; //€
	private int prezzoNoleggio; //£
	private int autonomia; //km
	private int efficienza; //kWh
	private int velocitaRicarica; //km/h
	private boolean ricaricaRapida; //1 true, 0 false
	private boolean trazioneIntegrale; //1 true, 0 false
	private int numeroPosti;
	private String segmento;
	private float prestazioni; //s
	private int velocitaMax; //km/h
	
	
	public AutoElettriche(String marca, String modello, int prezzoVendita, int prezzoNoleggio, int autonomia,
			int efficienza, int velocitaRicarica, boolean ricaricaRapida, boolean trazioneIntegrale, int numeroPosti,
			String segmento, float prestazioni, int velocitaMax) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.prezzoVendita = prezzoVendita;
		this.prezzoNoleggio = prezzoNoleggio;
		this.autonomia = autonomia;
		this.efficienza = efficienza;
		this.velocitaRicarica = velocitaRicarica;
		this.ricaricaRapida = ricaricaRapida;
		this.trazioneIntegrale = trazioneIntegrale;
		this.numeroPosti = numeroPosti;
		this.segmento = segmento;
		this.prestazioni = prestazioni;
		this.velocitaMax = velocitaMax;
	}
	
	public AutoElettriche() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getPrezzoVendita() {
		return prezzoVendita;
	}

	public void setPrezzoVendita(int prezzoVendita) {
		this.prezzoVendita = prezzoVendita;
	}

	public int getPrezzoNoleggio() {
		return prezzoNoleggio;
	}

	public void setPrezzoNoleggio(int prezzoNoleggio) {
		this.prezzoNoleggio = prezzoNoleggio;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public int getEfficienza() {
		return efficienza;
	}

	public void setEfficienza(int efficienza) {
		this.efficienza = efficienza;
	}

	public int getVelocitaRicarica() {
		return velocitaRicarica;
	}

	public void setVelocitaRicarica(int velocitaRicarica) {
		this.velocitaRicarica = velocitaRicarica;
	}

	public boolean isRicaricaRapida() {
		return ricaricaRapida;
	}

	public void setRicaricaRapida(boolean ricaricaRapida) {
		this.ricaricaRapida = ricaricaRapida;
	}

	public boolean isTrazioneIntegrale() {
		return trazioneIntegrale;
	}

	public void setTrazioneIntegrale(boolean trazioneIntegrale) {
		this.trazioneIntegrale = trazioneIntegrale;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public float getPrestazioni() {
		return prestazioni;
	}

	public void setPrestazioni(float prestazioni) {
		this.prestazioni = prestazioni;
	}

	public int getVelocitaMax() {
		return velocitaMax;
	}

	public void setVelocitaMax(int velocitaMax) {
		this.velocitaMax = velocitaMax;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modello == null) ? 0 : modello.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoElettriche other = (AutoElettriche) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modello == null) {
			if (other.modello != null)
				return false;
		} else if (!modello.equals(other.modello))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"Marca:%s, Modello:%s\nAutonomia:%s, Efficienza:%s, Velocita di Ricarica:%s, Ricarica Rapida=%s\nTrazione Integrale=%s, Numero Posti=%s, Segmento=%s\nPrestazioni 0-100=%s, Velocita Massima=%s\n",
				marca, modello, autonomia, efficienza, velocitaRicarica, ricaricaRapida, trazioneIntegrale, numeroPosti,
				segmento, prestazioni, velocitaMax);
	}
	
	
	
	
	

}
